package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		InputStream is=new FileInputStream("C:/Temp/test1.db");
		
		while(true) {
			int data=is.read();//1byte �� �б�
			if(data==-1)break; 	//���� ���� �������� ���
			System.out.println(data);
		}
		is.close();//�Է½�Ʈ���� ����

	}

}
