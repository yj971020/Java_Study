package socket_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("192.168.0.249", 8111); //언니 ip

		// Socket socket = new Socket("192.168.0.134", 8111); // 강사님 ip
		System.out.println("서버연결완료");

		//데이터 전송 
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);

		//데이터 수신
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		
		// 키보드 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("서버로 전송 할 메세지를 입력해 주세요.");

		//exit 칠때까지 입력받기
		while (true) {
			System.out.print("> ");
			String sendmsg = sc.nextLine();
			
			dos.writeUTF(sendmsg);
			dos.flush();
			
			String readmsg=dis.readUTF();
			System.out.println("서버응답: " +readmsg);
			if (sendmsg.equalsIgnoreCase("exit")) {
				break;
			}

		}

		
		dos.close();
		sc.close();

		socket.close();

		System.out.println("클라이언트 종료");

	}

}
