package chatting_programming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.framework.TcpApplication;

public class AppServer extends TcpApplication{

	/*
	 * 어플리케이션 초기화
	 */
	@Override
	public void init() {
		super.init();
	}
	
	/*
	 * 어플리케이션 실행
	 */
	
	@Override
	public void start() {
		System.out.println(TcpApplication.timeStamp());
		System.out.println("TCP/IP 서버프로그램을 시작합니다.");
		System.out.println("SERVER START >>>");
		
		ServerSocket server = null;
		Socket cSocket = null;
		Thread th =null;
		try {
		// 1. 서버 소켓 생성
		server = new ServerSocket(PORT);
		// 2. 클라이언트와 연결 된 소켓 관리
		while(true) {

			cSocket = server.accept(); //연결될때마다 소켓이 계속 생기는 것
			
			System.out.println(timeStamp());
			System.out.println("클라이언트 접속 대기중...");
			
			/* 접속한 클라이언트 송수신을 담당할 스레드를 생성하여 소켓을 전달한다.
			 * 접속자 수 만큼 스레드가 생성된다.
			 */
			
			//TcpServerHandler에게 소켓을 전달할 스레드
			th = new Thread(new TcpServerHandler(cSocket));
			th.start();
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
