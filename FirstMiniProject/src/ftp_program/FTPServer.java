package ftp_program;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.framework.TcpApplication;

/**
 * [미니프로젝트 주요 기능구현한 클래스]
 */
public class FTPServer extends TcpApplication {
	/*
	 * [필드]
	 */
	
	//입력 스트림
	public static InputStream in = null;
	public static DataInputStream din = null;
	public static FileInputStream fin = null;
	public static BufferedReader br = null;
	public static BufferedOutputStream bo = null;
	
	//출력 스트림
	public static OutputStream out = null;
	public static DataOutputStream dout = null;
	public static PrintWriter pw = null;
	
	//소켓
	public static ServerSocket serverSoc =null;
	public static Socket clientSoc =null;
	
	//클라이언트 주소
	public static String clientAddr = null;
	
	//서버 시작
	@Override
	public void start() {
		
		/* 
		 * 클라이언트 접속 대기 및 소켓 생성
		 */
		try {
		//서버 소켓 할당
		serverSoc = new ServerSocket(PORT);
		System.out.println(timeStamp()+"클라이언트 접속을 대기중입니다...");
		System.out.println();
			
		//서버-클라이언트 연결
		clientSoc = serverSoc.accept(); 
		
		//주소를 스트링으로 반환
		clientAddr = clientSoc.getInetAddress().getHostName();
		System.out.println(timeStamp()+clientAddr + "<- connected.");
		
		/*
		 * 수신(IN) : 클라이언트 소켓에 연결된 "읽기" 스트림
		 */
		in = clientSoc.getInputStream();
		din = new DataInputStream(in);
		br = new BufferedReader(new InputStreamReader(in));
		
		
		/*
		 * 송신 (OUT) : 서버소스 폴더 내 파일을 클라이언트에게 보냄 
		 */
		out = clientSoc.getOutputStream();
		dout = new DataOutputStream(out);
		bo = new BufferedOutputStream(out);
		pw = new PrintWriter(new OutputStreamWriter(out));

		// <로그인 세션>
		accountCheck();
		
		// <리스트 업로드 세션>
		listUpload();
		
		// <메인 세션>
		// 클라이언트 메뉴선택에 따라 switch문으로 이동
		clientStatus();
		
		}catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				//소켓 및 스트림  닫기
				if(in != null) {in.close();}
				if(out != null) {out.close();}
				if(clientSoc != null) {clientSoc.close();}
				if(serverSoc != null) {serverSoc.close();}
			}catch(IOException ex ) {ex.printStackTrace();}
		}
		System.out.println(timeStamp()+"파일 전송 서비스를 종료합니다.");
			}

	

	/*
	 * [주요 메소드 모음]
	 */
	
	//음악을 서버 폴더에서 클라이언트 폴더로 전송해주는 메소드
	public static void musicUpload(String fileName) throws IOException {
		 
		System.out.println("파일을 보내는 중...");
		System.out.println();
		//송신 시간 측정 시작
		  long start = System.currentTimeMillis();

		while(true) {
			//읽기 : 경로에 지정된 파일을 바이너리 데이터로 data변수에 1byte씩 저장
			int data = fin.read();
//			System.out.println("서버에서 읽기"+data);
			
			//쓰기 : 받은 data를 1byte씩 dout 스트림 통로에 보냄
			dout.write(data); 
			dout.flush();
//			System.out.println("서버에서 쓰기"+data);
			// data 출력이 끝나면 -1을 반환하므로 break로 반복분 탈출
			if(data == -1) break;
		}
		//송신 시간 측정 종료
		 long end = System.currentTimeMillis();

		System.out.println("데이터 송신 완료 : 약"+ (end-start) / 1000 +"초" );
		System.out.println("전송완료");
	}
	
	//디렉토리내의 파일 리스트를 클라이언트로 송부해주는 메소드
	public static void listUpload() {
		// <파일 리스트 전송 기능>
		File rcs = new File("sources\\");
		int i=0;
		for(String file : rcs.list()) {
			//파일명 전송
			pw.println((++i)+"번 트랙 : "+file);
			pw.flush();
			//파일 크기 전송
			pw.println(file.length());
			pw.flush();
		}
	
		//리스트 전송 완료되면 quit 메시지를 클라이언트로 보내서 세션 종료 할 수 있도록 구현
			pw.println("quit");
			pw.flush();
			pw.println("quit");
			pw.flush();
			System.out.println("리스트 전송완료!");
	}
	
	//로그인 세션에서 사용되며, 로그인 및 회원가입 성공 여부 판단함
	public void accountCheck() throws IOException {
		Login :while (true) {
			int input = (in.read());
			
			switch(input) {
			case 1 : 
				System.out.println("클라이언트 - 회원 가입페이지 입장.");
				break;
			case 2 : 
				System.out.println("클라이언트 - 로그인 페이지 입장.");
				int is_success=(in.read());
				if(is_success !=0) {
					break Login;
				}
				break; 
			case 3:
				System.out.println("클라이언트 - 게스트로 입장.");
				break Login;
				
			case 4: 
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
		}
	}
	//메인세션에서 사용되며, 클라이언트 메뉴 상황에 따라 유기적으로 데이터를 뿌려줌
	private void clientStatus() throws IOException {

		Loop1: while(true) {
			//클라이언트에서 보낸 메뉴 번호 수신
			int input = (in.read());
			
			switch(input) {
			case 1 : 
				System.out.println("클라이언트 - 음악 재생중");
				break;
			case 2 : 
				System.out.println("클라이언트 - 음원 다운 기능");
				
				//클라이언트가 선택한 파일을 fileName에 저장
				String fileName = din.readUTF();
				
				//sources 경루오 fileName을 붙여줌으로써 해당 파일을 받아올 수 있도록 만듬
				fin = new FileInputStream("sources\\"+fileName);
				 
				// 음악을 클라이언트에게 전송하는 메소드
				musicUpload(fileName);
				break; 
			case 3:
				System.out.println("클라이언트 - 곡정보 출력중");
				break;
			case 4:
				System.out.println("프로그램 종료");
				break Loop1;
			}
		}
	}
}



