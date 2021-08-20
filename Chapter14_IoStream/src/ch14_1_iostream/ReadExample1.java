package ch14_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {

		Reader reader=new FileReader("C:/Temp/test7.txt");
	
		while (true) {
			int data=reader.read();
			if(data==-1) 
			break;
			System.out.println((char)data);
		}
		reader.close();
	}

}
