package socket_programming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("192.168.0.249", 8111);

		// Socket socket = new Socket("192.168.0.134", 8111); // ����� ip
		System.out.println("��������Ϸ�");

		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);

		// Ű���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �� �޼����� �Է��� �ּ���.");

		while (true) {
			System.out.print("> ");
			String msg = sc.nextLine();
			dos.writeUTF(msg);
			dos.flush();
			if (msg.equalsIgnoreCase("exit")) {
				break;
			}

		}

//		
//		InputStream in = socket.getInputStream();
//		DataInputStream dis = new DataInputStream(in);
		dos.close();
		sc.close();

		socket.close();

		System.out.println("Ŭ���̾�Ʈ ����");

	}

}
