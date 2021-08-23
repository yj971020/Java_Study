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

		Socket socket = new Socket("192.168.0.249", 8111); //��� ip

		// Socket socket = new Socket("192.168.0.134", 8111); // ����� ip
		System.out.println("��������Ϸ�");

		//������ ���� 
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);

		//������ ����
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		
		// Ű���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �� �޼����� �Է��� �ּ���.");

		//exit ĥ������ �Է¹ޱ�
		while (true) {
			System.out.print("> ");
			String sendmsg = sc.nextLine();
			
			dos.writeUTF(sendmsg);
			dos.flush();
			
			String readmsg=dis.readUTF();
			System.out.println("��������: " +readmsg);
			if (sendmsg.equalsIgnoreCase("exit")) {
				break;
			}

		}

		
		dos.close();
		sc.close();

		socket.close();

		System.out.println("Ŭ���̾�Ʈ ����");

	}

}
