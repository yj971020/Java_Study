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
		
		//�ѹ��ھ� ���
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		//��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���	
		writer.flush();
		//��� ��Ʈ���� ����
		writer.close();
		
	}

}
