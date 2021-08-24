package ftp_programming;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	public static final int PORT = 10001;

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(PORT);
		System.out.println("Ŭ���̾�Ʈ ������ ����մϴ�.");

		Socket client = server.accept();
		System.out.println(client.getInetAddress().getHostName() + "���� �����ϼ̽��ϴ�.");

		OutputStream out = client.getOutputStream();
		OutputStreamWriter outw = new OutputStreamWriter(out);
		PrintWriter pw = new PrintWriter(outw);

		FileInputStream fin = null;
		DataOutputStream dout = new DataOutputStream(out);

		/*
		 * ���ҽ� �ڵ� ����
		 */

		File resce = new File("resources\\");
//���ϰ����� �̸� ���
		System.out.println(resce.list().length + "���� ������ �ֽ��ϴ�.");
		String filepath = null;
		for (String file : resce.list()) {

			// ���� ���� (�̸�/ ũ��) ����
			filepath = resce.getName() + "\\" + file;
			File sendFile = new File(filepath);
			System.out.println(sendFile.getName() + "�۽���....");

			// ���� �۽�
			pw.println(sendFile);
			pw.flush();
			pw.println(sendFile.length());
			pw.flush();

			fin = new FileInputStream(filepath);
			int cnt = 0;
			for (int i = 0; i < sendFile.length(); i++) {
				// �����б�
				int data = fin.read();
				// ���Ͼ���
				dout.write(data);
				if (cnt % 3000 == 0) {
					System.out.println("******************");
				}

				cnt++;

			}
			System.out.println("�Ϸ�\n");
		}
		fin.close();
		dout.close();
		pw.close();
		client.close();
		server.close();

		System.out.println();
		System.out.println("���Ϲ��� ���� �ý��� ����");
	}
}
