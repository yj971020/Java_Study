package ftp_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FTPClient {

	public static final String IP = "localhost";
	//public static final String IP = "192.168.25.30";
	public static final int PORT = 8111;

	public static void main(String[] args) {

		// ����� ��Ʈ��
		InputStream in = null;
		OutputStream out = null;
		DataInputStream din = null;
		DataOutputStream dout = null;
		FileOutputStream fos = null;
		Scanner sc = null;

		// ����
		Socket socket = null;

		try {
			socket = new Socket(IP, PORT);
			sc = new Scanner(System.in);

			// ����
			in = socket.getInputStream();
			din = new DataInputStream(in);

			// �۽�
			out = socket.getOutputStream();
			dout = new DataOutputStream(out);

			menuDisplay();
			String fileName = sc.nextLine();

			// ������ ����
			dout.writeUTF(fileName);
			System.out.println(timeStamp() + "���� ������ ��û�Ͽ����ϴ�.\n");

			// ���ϵ����� ����
			System.out.println("���� ������...\n");

			fos = new FileOutputStream("C:/Temp/" + fileName);
			int cnt=0;
			while (true) {
				// �б�
				int data = din.read();
				if (data == -1) {
					break;
				}
				// ����
				fos.write(data);
		if(cnt%5000==0) {
			System.out.println("��");
		}
		cnt++;
			}
			
			System.out.println("\n ���ϼ��ſϷ�: "+cnt+"(����Ʈ)");
			System.out.println();
			System.out.println(timeStamp() + "���� �ٿ�ε� �Ϸ�\n");

		} catch (IOException ex) {
			ex.printStackTrace();

		} finally {
			try {
				if (din != null) {
					din.close();
				}
				if (dout != null) {
					din.close();
				}
				if (fos != null) {
					fos.close();
				}
				if (socket != null) {
					socket.close();
				}

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	private static void menuDisplay() {
		System.out.println();
		System.out.println("-----------------");
		System.out.println();
		System.out.println("�ް���� ������ �̸�(���ϸ�.Ȯ����)�� �Է����ּ���");
		System.out.println();
		System.out.println("[1]aaa.txt [2]bbb.txt [3]ccc.txt [4]image.png \n");
		System.out.print("����> ");
	}

	private static String timeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}
}
