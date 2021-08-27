package SoundCloud;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Play {
	
	public static void main(String[] args) throws Exception {
	Scanner scn=new Scanner(System.in);
	int ran=Integer.parseInt(scn.nextLine());
		selectMusic(ran);
	}
	
	public static void selectMusic(int sel) throws Exception { //sel: 클라이언트가 선택한 번호를 받고 음악 재생
		
		switch(sel) {
		case 1:
			System.out.println("case1 playing");
			playmusic("C:\\Temp\\africa-toto.wav");
			
			break;
		case 2:
			System.out.println("case2 playing");
			playmusic("C:\\Temp\\around_the_world-atc.wav");
			
			break;
		case 3:
			System.out.println("case3 playing");
			playmusic("C:\\Temp\\evangeline-matthew_sweet.wav");
			
			break;
		case 4:
			System.out.println("case4 playing");
			playmusic("C:\\Temp\\dont_speak-no_doubt.wav");
			
			break;
		}
	}

	public static void playmusic(String FilePath) throws Exception { //파일의 경로를 받아 음악 재생 
	while (true) {
//		System.out.print("재생하고 싶은 곡의 번호를 입력하세요 > ");
//		Scanner scn=new Scanner(System.in);
//		int ran=Integer.parseInt(scn.nextLine());
//			selectMusic(ran);

			File a = new File(FilePath);
			AudioInputStream b = AudioSystem.getAudioInputStream(a);
			Clip c = AudioSystem.getClip();
			c.open(b);
			c.start();

			Thread.sleep(10000); //10초간 재생 
			c.close();
			break;
		}
		
		
	}
}
