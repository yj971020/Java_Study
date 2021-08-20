package ch14_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws IOException {
		
		
	
		String path="C:/Temp/test1.db";
		OutputStream out =new FileOutputStream(path);
		
		byte[] array = {10,20,30,40,50};
		
		out.write(array, 1,3);
		
		out.flush();//출력버퍼에 잔류하는 모든 바이트 출력
		out.close();//출력스트림을 닫음
		

	}

}
