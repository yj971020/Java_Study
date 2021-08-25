package SoundCloud;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Play {
	
	public static void selectMusic(int sel) throws Exception { //sel: Ŭ���̾�Ʈ�� ������ ��ȣ�� �ް� ���� ���
		
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

	public static void playmusic(String FilePath) throws Exception { //������ ��θ� �޾� ���� ��� 
	while (true) {

			File a = new File(FilePath);
			AudioInputStream b = AudioSystem.getAudioInputStream(a);
			Clip c = AudioSystem.getClip();
			c.open(b);
			c.start();

			Thread.sleep(5000); //5�ʰ� ��� 
			c.close();
			break;
		}
		
		
	}
}
