package ch12_1_multi_thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
public static void main(String[] args) {
	// 1초 주기로 beep음 발생과 동시에 문자 출력
	Thread th=new Thread(new BeepTest());
	th.start();
	for(int i=0;i<5;i++) {
		System.out.println(i+1+". ding");
		try {Thread.sleep(500);}catch(Exception e) {}
	}
}
}
