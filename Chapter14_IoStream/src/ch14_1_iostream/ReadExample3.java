package ch14_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("C:/Temp/test7.txt");

		char[] buffer = new char[100];

		while (true) {
			int readCharnum = reader.read(buffer);
			if (readCharnum == -1)
				break;
			for (int i = 0; i < readCharnum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
