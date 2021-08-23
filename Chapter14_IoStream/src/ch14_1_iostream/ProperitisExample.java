package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Properties;

public class ProperitisExample {

	public static void main(String[] args) {
		/*
		 * [Properties] �ܺ����� ���� �о����
		 * 
		 * - '=' �Ǵ� ':'�� ����� �����̾�� �Ѵ�. - �ּ������� ù ��° ���ڰ� # �̾�� �Ѵ�. - ��� '/'
		 */
		String path = "src/input.txt";

		Properties settings = new Properties();

		try {
			settings.load(new FileInputStream(path));

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�. ");
			System.exit(0);
		}

		String eName = settings.getProperty("eng_name");
		System.out.println(eName);

//		String KName=settings.getProperty("Kor_name");
//		try {
//			KName=new String(KName.getBytes("8859_1"),"EUC-KR");
//		}catch(UnsupportedEncodingException e) {
//		}
//	System.out.println(KName);
		String[] data = settings.getProperty("data").split(",");
		System.out.println(Arrays.toString(data));

		settings.list(System.out);
	}

}
