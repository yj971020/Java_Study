package ch12_1_multi_thread;

import java.awt.Toolkit;

public class BeepTest implements Runnable{
	public void run() {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
