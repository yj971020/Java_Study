package ch14_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample5 {

	public static void main(String[] args) throws IOException {
		
		
		byte a=10;
		byte b=20;
		byte c=30;
		String path="C:/Temp/test1.db";
		OutputStream out =new FileOutputStream(path);
		
		out.write(a);
		out.write(b);
		out.write(c);
		
		out.flush();//출력버퍼에 잔류하는 모든 바이트 출력
		out.close();//출력스트림을 닫음
		

	}

}
