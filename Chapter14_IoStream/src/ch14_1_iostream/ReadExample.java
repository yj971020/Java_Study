package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		InputStream is=new FileInputStream("C:/Temp/test1.db");
		
		byte[] buffer=new byte[100];
		
		while(true) {
			int readByteNum=is.read(buffer);
			if(readByteNum==-1)break; 	//���� ���� �������� ���
			
			for(int i=0;i<readByteNum;i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();//�Է½�Ʈ���� ����

	}

}
