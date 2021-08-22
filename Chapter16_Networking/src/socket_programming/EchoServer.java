package socket_programming;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

public static void main(String[] args) throws IOException {
		
		
		ServerSocket server= new ServerSocket(8111);
		System.out.println("���� �غ� �Ϸ�");
		
		Socket socket=server.accept();
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		
		System.out.println(socket.getInetAddress());
		
		InputStream in= socket.getInputStream();
		DataInputStream dis=new DataInputStream(in);
		while (true) {
			System.out.print("> ");
			String usermsg = dis.readUTF();
			System.out.println("����ڸ޼���: "+usermsg);
			if (usermsg.equalsIgnoreCase("exit")) {
				break;
			}

		}
		String usermsg=dis.readUTF();
		System.out.println("����� �޼���: "+ usermsg);
		
		dis.close();
		in.close();
		
		socket.close();
		server.close();
		
	
		
		
	}
}
