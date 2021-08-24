package chatting_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

import com.framework.TcpApplication;

/*
 * AppServer로 부터 전달받은 소켓을 이용하여 
 * 클라이언트의 접속 정보 및 송수신 기능을 관리한다. 
 */


public class TcpServerHandler implements Runnable{
	//모든 참여자의 id와 밖으로 나갈 메시지가 담길 해시맵
	//TcpServerHandler가 생길때마다 새로운 스레드가 하나씩 생기는 개념이라, 전역변수로 맵을 지정해줘서 새로 생기는 것이 아닌, 다 담을 수 있도록 해줌
	/*클라이언트 ID를 키(K)로 하는 송신(V)을 위한 맵 자료구조
	 * 
	 */
	public static HashMap<String, PrintWriter> sendMap = new HashMap<>();
	
	// 클라이언트와 연결된 소켓 객체
	private Socket sock;
	
	// 클라이언트 IP 주소
	private String cAddr;
	
	// 클라이언트 ID
	private String id;
	
	/*
	 * 생성자
	 * 받아 온 소켓을 맵에 저장
	 */
	public TcpServerHandler(Socket cSocket) {
		this.sock = cSocket;
		this.cAddr = sock.getInetAddress().getHostAddress();
		
	}
	/*
	 * 참여자 입/퇴실 관리
	 * 브로드 캐스팅 (접속자들에게 전부 뿌려주는 것)
	 * 참여자 송수신 관리
	 */
	@Override
	public void run() {
		try {
			// 1. 송신 스트림 얻기
			PrintWriter pw = new PrintWriter(//입력값을 한줄씩 보내줄수 있음
							 new OutputStreamWriter( //아웃풋스트림라이터를 받아온 소켓의 아웃풋 스트림에 끼움
							 sock.getOutputStream()));
			
			// 2. 수신 스트림 얻기
			BufferedReader br = new BufferedReader(
								new InputStreamReader(
								sock.getInputStream()));
			
			// 3. 클라이언트 접속 정보 저장 
			id = br.readLine();
			TcpServerHandler.sendMap.put(id, pw); //맵에 키는 id로, 벨류는 pw(PrintWriter)로 저장
			
			// 4. 클라이언트 입장 정보를 브로드캐스팅
			TcpServerHandler.broadCast(TcpApplication.timeStamp() + "["+id+"] 님이 들어 오셨습니다.");
			System.out.println(TcpApplication.timeStamp() + cAddr + " ← Connected");
			System.out.println(TcpApplication.timeStamp() + "참여인원: " + sendMap.size()+ "명");
			
			// 5. 수신/송신
			String line = null;
			while((line = br.readLine()) != null) {
				// 퇴장하는 경우
				if(line.equalsIgnoreCase("/quit")) {
					// 퇴장 정보 브로드캐스팅
					TcpServerHandler.broadCast(TcpApplication.timeStamp() + "["+id+"] 님이 퇴장 하였습니다.");
					break;
				}
				// 귓속말 하는 경우
				else if (line.indexOf("/to") > -1) { //to라는 문자열을 찾아서 인덱스번호를 리턴하고, 없으면 -1을 리턴함
					//귓속말 메서드 호출
					whisper(id, line);
				}
				// 일반 메시지 전송
				else {
					String msg =  "["+id+"]"+ " " + line;
					TcpServerHandler.broadCast(msg);
				}
			}
			
			/*
			 *  퇴장하는 경우처리
			 */
			System.out.println(TcpApplication.timeStamp()+ cAddr + "→ Disconnected" );
			
			// 맵에서 해당 객체 삭제
			TcpServerHandler.sendMap.remove(id);
			System.out.println(TcpApplication.timeStamp() + "참여인원: " + sendMap.size()+ "명");
			
			//스트림 닫기
			pw.close();
			br.close();
			sock.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
	/* 귓속말 전송 메소드
	 * 
	 */
	private void whisper(String name, String msg) {
		//내일 마저 구현할 예정
	}
	
	/* 메시지 일괄 전송 메소드
	 * : 모든 참여자에게 일괄적으로 전송
	 */
	public static void broadCast(String message) {
		//해쉬맵에 values값은 각 접속한 소켓임. 해당 소켓들은 PrintWriter 타입인점 참고
		//sendMap에 여러 스레드가 동시 접근하므로 동기화(synchronized)처리가 필요함
		synchronized(sendMap) {
			//접속한 모든 클라이언트(소켓)들에게 메시지를 전송해줌
			for(PrintWriter cpw  : TcpServerHandler.sendMap.values()) {
				cpw.println(message);
				cpw.flush();
			}
		}
	}
}
