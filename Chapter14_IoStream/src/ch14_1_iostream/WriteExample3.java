package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample3 {
	public static void main(String[] args) throws IOException {
		
		Writer writer=new FileWriter("C:/Temp/test7.txt");
		
		char a='A';
		char b='B';
		char c='C';
		
		//한문자씩 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		//출력 버퍼에 잔류하는 모든 문자를 출력	
		writer.flush();
		//출력 스트림을 닫음
		writer.close();
		
	}

}
