package socket_programming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SimpleServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server= new ServerSocket(8111);
		System.out.println("���� �غ� �Ϸ�");
		
		Socket socket=server.accept();
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		
		
		byte[] arr = {1,2,3,4,5,6,7,8,9,100};
		String s="�ȳ��ϼ���";
		
		OutputStream out = socket.getOutputStream()	;
		out.write(arr);
		out.flush();
		out.close();
		
	}

}
