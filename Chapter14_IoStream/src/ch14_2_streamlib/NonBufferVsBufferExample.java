package ch14_2_streamlib;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception {

		try {
			String orgFilePath1 = NonBufferVsBufferExample.class.getResource("orgFile1.jpg").getPath();
			String targetFilePath1 = "C:/Temp/targerFile1.jpg";
			FileInputStream fis = new FileInputStream(orgFilePath1);
			FileOutputStream fos = new FileOutputStream(targetFilePath1);

			String orgFilePath2 = NonBufferVsBufferExample.class.getResource("org2.jpg").getPath();
			String targerFilePath2 = "C:/Temp/tergetFile2.jpg";

			FileInputStream fis2 = new FileInputStream(orgFilePath2);
			FileOutputStream fos2 = new FileOutputStream(targerFilePath2);

			BufferedInputStream bis = new BufferedInputStream(fis2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);

			long nonBufferTime = copy(fis, fos);
			System.out.println("버퍼를 사용하지 않았을 떄 : " + nonBufferTime + "ns");
			long BufferTime = copy(fis, fos);
			System.out.println("버퍼를 사용했을 떄 : " + BufferTime + "ns");

		} catch (IOException e) {

		}
	}

	static int data = -1;

	private static long copy(FileInputStream fis, FileOutputStream fos) throws IOException {
		long start = System.nanoTime();
		while (true) {
			data = fis.read();
			if (data == -1) {
				break;
			}
			fos.write(data);
		}
		fos.flush();
		long end = System.nanoTime();
		return (end - start);
	}
}
