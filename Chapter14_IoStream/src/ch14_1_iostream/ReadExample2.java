package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		InputStream is=new FileInputStream("C:/Temp/test1.db");
		
		while(true) {
			int data=is.read();//1byte 씩 읽기
			if(data==-1)break; 	//파일 끝에 도달했을 경우
			System.out.println(data);
		}
		is.close();//입력스트림을 닫음

	}

}
