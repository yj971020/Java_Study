package ftp_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * [���� ���� ���α׷���]
 * 1.Ŭ���̾�Ʈ�� Ư���� ���ϸ��� ������ ��û
 * 2.������ Ŭ���̾�Ʈ�� ��û�� ������ ã�´�
 * 3.��û�� ������ ã���� ����(���ҽ� ����)���� �����͸� �о���δ�.
 * 4.�о� �� ������ �����͸� Ŭ���̾�Ʈ���� �����Ѵ�.
 * 5.Ŭ���̾�Ʈ�� ���� �޼����� ȭ�鿡 ����ϰ� �����Ѵ�.
 */
public class FTPServer {
	private static int PORT = 8111;

	public static void main(String[] args) throws IOException {

		// ����� ��Ʈ��
		InputStream in = null;
		OutputStream out = null;
		DataInputStream din = null;
		DataOutputStream dout = null;
		FileInputStream fin=null;

		// ����
		ServerSocket serverSoc = null;
		Socket clientSoc = null;

		// ȣ��Ʈ �ּ�
		String clientAddr = null;

		/*
		 * Ŭ���̾�Ʈ ���� ��� �� ���� ���� 
		 * ���� / �۽�
		 */
		try {
			serverSoc = new ServerSocket(PORT);
			System.out.println(timeStamp() + "Ŭ���̾�Ʈ ������ ������Դϴ�...");
			System.out.println();

			clientSoc = serverSoc.accept();
			clientAddr = clientSoc.getInetAddress().getHostName();
			System.out.println(timeStamp() + clientAddr + "<-connected.");

			/*
			 * ����(In) : Ŭ���̾�Ʈ�� ���� ���ϸ�
			 */
			in = clientSoc.getInputStream();
			din = new DataInputStream(in);

			/*
			 * �۽�(out) : �����ҽ����� �� ������ �ʿ�� �ϴ��� �ľ�
			 */

			out = clientSoc.getOutputStream();
			dout = new DataOutputStream(out);

			// �ܰ�1 : ����ڰ� ���� ������ �ʿ�� �ϴ��� �ľ�
			String fileName = din.readUTF();

			// �ܰ�2 : ���� �����͸� ã�Ƴ��� �����͸� �д´�.
			 fin = new FileInputStream("resources\\" + fileName);
			// �ܰ�3 : ���� �����͸� �а� �����͸� ������.
			System.out.println("������ ��������....");
			System.out.println();

			// ������ �а� ������
			while (true) {
				// �б�
				int data = fin.read();
				if (data == -1)	
				break;

				// ����
				dout.write(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (din != null) {
				din.close();
			}
			if (dout != null) {
				din.close();
			}
			if (clientSoc != null) {
				clientSoc.close();
			}
			if (serverSoc != null) {
				serverSoc.close();
			}
		}
	}

	/*
	 * ����ð��� �������ִ� �޼ҵ� ��ȯŸ�� String
	 */
	private static String timeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}
}