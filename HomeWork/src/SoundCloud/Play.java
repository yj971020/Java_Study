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
	
	public static void selectMusic(int sel) throws Exception { //sel: Ŭ���̾�Ʈ�� ������ ��ȣ�� �ް� ���� ���
		
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

	public static void playmusic(String FilePath) throws Exception { //������ ��θ� �޾� ���� ��� 
	while (true) {
//		System.out.print("����ϰ� ���� ���� ��ȣ�� �Է��ϼ��� > ");
//		Scanner scn=new Scanner(System.in);
//		int ran=Integer.parseInt(scn.nextLine());
//			selectMusic(ran);

			File a = new File(FilePath);
			AudioInputStream b = AudioSystem.getAudioInputStream(a);
			Clip c = AudioSystem.getClip();
			c.open(b);
			c.start();

			Thread.sleep(10000); //10�ʰ� ��� 
			c.close();
			break;
		}
		
		
	}
}
