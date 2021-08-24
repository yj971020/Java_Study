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
		System.out.println("클라이언트 접속을 대기합니다.");

		Socket client = server.accept();
		System.out.println(client.getInetAddress().getHostName() + "님이 접속하셨습니다.");

		OutputStream out = client.getOutputStream();
		OutputStreamWriter outw = new OutputStreamWriter(out);
		PrintWriter pw = new PrintWriter(outw);

		FileInputStream fin = null;
		DataOutputStream dout = new DataOutputStream(out);

		/*
		 * 리소스 자동 배포
		 */

		File resce = new File("resources\\");
//파일갯수와 이름 출력
		System.out.println(resce.list().length + "개의 파일이 있습니다.");
		String filepath = null;
		for (String file : resce.list()) {

			// 파일 정보 (이름/ 크기) 열기
			filepath = resce.getName() + "\\" + file;
			File sendFile = new File(filepath);
			System.out.println(sendFile.getName() + "송신중....");

			// 파일 송신
			pw.println(sendFile);
			pw.flush();
			pw.println(sendFile.length());
			pw.flush();

			fin = new FileInputStream(filepath);
			int cnt = 0;
			for (int i = 0; i < sendFile.length(); i++) {
				// 파일읽기
				int data = fin.read();
				// 파일쓰기
				dout.write(data);
				if (cnt % 3000 == 0) {
					System.out.println("******************");
				}

				cnt++;

			}
			System.out.println("완료\n");
		}
		fin.close();
		dout.close();
		pw.close();
		client.close();
		server.close();

		System.out.println();
		System.out.println("파일배포 서비스 시스템 종료");
	}
}
