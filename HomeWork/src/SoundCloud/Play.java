package SoundCloud;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Play {
	
	public static void selectMusic(int sel) throws Exception { //sel: 클라이언트가 선택한 번호를 받고 음악 재생
		
		switch(sel) {
		case 1: 
			playmusic("C:\\Temp\\africa-toto.wav");
			System.out.println("case1 playing");
			break;
		case 2:
			playmusic("C:\\Temp\\around_the_world-atc.wav");
			System.out.println("case2 playing");
			break;
		case 3:
			playmusic("C:\\Temp\\evangeline-matthew_sweet.wav");
			System.out.println("case3 playing");
			break;
		case 4:
			playmusic("C:\\Temp\\dont_speak-no_doubt.wav");
			System.out.println("case4 playing");
			break;
		}
	}

	public static void playmusic(String FilePath) throws Exception { //파일의 경로를 받아 음악 재생 
	while (true) {

			File a = new File(FilePath);
			AudioInputStream b = AudioSystem.getAudioInputStream(a);
			Clip c = AudioSystem.getClip();
			c.open(b);
			c.start();

			Thread.sleep(5000); //5초간 재생 
			c.close();
			break;
		}
		
		
	}
}
