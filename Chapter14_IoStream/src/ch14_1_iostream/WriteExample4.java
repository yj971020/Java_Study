package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws IOException {
		
		Writer w=new FileWriter("C:/Temp/test9.txt");
		
		String str="ABC";
		
		w.write(str); //문자열 전체를 출력
		
		
		w.flush();
		w.close();
		

	}

}
