package chatting_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import com.framework.TcpApplication;

public class AppClient extends TcpApplication{
	
	public static PrintWriter pw = null; //쓰는것
	public static BufferedReader keyboard = null; // 키보드 읽는것
	public static BufferedReader br = null; // 서버에서 보낸 데이터 읽는것
	public static Socket sSock = null; //서버와 연결되는 소켓
	
	// 서버 IP 주소
	private static String sAddr = null; 
	
	// 클라이언트 ID
	private String id = null;
	
	
	
	/*
	 * 어플리케이션 초기화
	 */
	@Override
	//IP주소나 포트번호 가져옴
	public void init() {
		super.init();
	}
	
	/*
	 * 어플리케이션 실행
	 */
	
	@Override
	public void start() {
		System.out.println(TcpApplication.timeStamp());
		System.out.println("TCP/IP 클라이언트 프로그램을 시작합니다.");
		System.out.println("CLIENT START >>>");
		
		try {
		// 1. 서버 연결
		System.out.println(TcpApplication.timeStamp()+ "서버 연결중...");
		sSock = new Socket(TcpApplication.IP,TcpApplication.PORT);
		sAddr = sSock.getInetAddress().getHostAddress();
		System.out.println(TcpApplication.timeStamp() + sAddr + "← Connected");
		
		// 2.1 송신 스트림 얻기
		 pw = new PrintWriter(
			  new OutputStreamWriter( 
			  sSock.getOutputStream()));
					
		// 2.2 수신 스트림 얻기
		 br = new BufferedReader(
			  new InputStreamReader(
			  sSock.getInputStream()));
		
		// 2.3 키보드 수신 스트림
		 keyboard = new BufferedReader(
				    new InputStreamReader(System.in)); //입력 빨대를 키보드에 꽂기
		
		// 3. 클라이언트의 id를 전송한다.
		 System.out.print("아이디 입력 :");
		 id = keyboard.readLine();
		 
		 pw.println(id); //id를 연결된 소켓을 통해 서버로 송신
		 pw.flush();
		 
		 //4. 접속한 서버의 데이터 수신을 담당할 스레드를 생성 하여 실행
		 //실시간으로 남들이 치는 채팅을 서버로 부터 받아서 클라쪽 콘솔에 뿌려줘야 하기때문에 두가지 쓰레드가 동시에 돌아야함
		 Thread thread = new Thread(new TcpClientHandler());
		 thread.start();
		 
		// 5. 접속한 서버에게 키보드 입력 메시지를 전송
		 String line = null;
		 while((line = keyboard.readLine())!=null) { //키보드로 입력하는 값이 null이 아니라면
			 pw.println(line);
			 pw.flush();
			 if(line.equalsIgnoreCase("/quit")) {
				 break;
			 }
		 }
		 
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
