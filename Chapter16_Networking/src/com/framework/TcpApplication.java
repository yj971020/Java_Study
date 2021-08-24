package com.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/*
 * 설정데이터 파일 초기화
 */
public abstract class TcpApplication {

	/*
	 * 어플리케이션에 필요한 필드 선언
	 */
	
	public static String IP;
	public static int PORT;
	public static String CONFIG="config/applicationcontext.ini";
	
	/*
	 * 어플리케이션 초기화
	 */
	public void init() {
		//설정데이터로부터 필요한 항목을 추출
		Properties settings = new Properties();
		try {
			settings.load(new FileInputStream(CONFIG));
			IP=settings.getProperty("IP");
			PORT=Integer.parseInt(settings.getProperty("PORT"));
			
			System.out.println("IPAddress: "+IP);
			System.out.println("PORT: "+PORT);
			
			System.out.println(TcpApplication.timeStamp());
		}catch (IOException e) {
			System.out.println("설정파일 (applicationcontext.ini)를 찾을 수 없습니다.");
			System.exit(0);
		}
	}
	/*
	 * 구현 클래스에서 오버라이딩 할 추상메소드
	 */
	public abstract void start();
		/*
		 * 현재시간을 리턴해주는 메소드
		 * 반환타입: String
		 */
	public static String timeStamp() {
		SimpleDateFormat format= new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}
	
}
