package ftp_programming;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileClient {
	public static final int PORT=10001;
	public static final String IP="localhost";
	//public static final String IP="192.168.0.134";

	public static void main(String[] args) throws IOException {
		Socket socket =new Socket(IP,PORT);
		
		InputStream in= socket.getInputStream();
		InputStreamReader inr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(inr);
		
		DataInputStream din= new DataInputStream(in);
		FileOutputStream fout=null;
		
		while(true ) {
			//���� �̸� ����
			String strline=br.readLine();
			String strlen=br.readLine();
			
			if(strline==null)break;
			System.out.println(strlen+"���� ������...");
			System.out.println("���� ũ��: "+ strlen+")");
			
			String path="C:/Temp/download/"+strline;
			fout=new FileOutputStream(path);
			
			int cnt = 0;
			for (int i = 0; i < Integer.parseInt(strlen); i++) {
				// �����б�
				int data = din.read();
				// ���Ͼ���
				fout.write(data);
				if (cnt % 3000 == 0) {
					System.out.print("*");
				}

				cnt++;

			}
			System.out.println("�Ϸ�\n");
		}
		fout.close();
		din.close();
		br.close();
		socket.close();
		
		System.out.println();
		System.out.println("���� ��û ���α׷��� �����մϴ�.");
	}

}
