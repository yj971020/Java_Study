package SoundCloud;


import java.awt.Container;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
	
	
	  public class FrameTest { 
		  
		  public static void main(String[] args) throws Exception {
			selectMusic(2);
		}
		  public static void selectMusic(int sel) throws Exception { //sel: Ŭ���̾�Ʈ�� ������ ��ȣ�� �ް� ���� ���
				
				switch(sel) {
				case 1: 
					Frame("C:\\Temp\\africa-toto.wav");
					System.out.println("case1 playing");
					break;
				case 2:
					Frame("C:\\Temp\\around_the_world-atc.wav");
					System.out.println("case2 playing");
					break;
				case 3:
					Frame("C:\\Temp\\evangeline-matthew_sweet.wav");
					System.out.println("case3 playing");
					break;
				case 4:
					Frame("C:\\Temp\\dont_speak-no_doubt.wav");
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
		  
	    public static void Frame(String path){
	    	
	            
	        JFrame f = new JFrame("�������"); 
	  
	       
	        JLabel label = new JLabel(path);
	        
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JButton btn = new JButton("��ư");
	        f.setLocationRelativeTo(null);
	        f.setSize(300,300);
			f.setVisible(true);
	   
	          
	        File file = new File(path);
	        System.out.println(file.exists( )); //true
	        
	        try {
	            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
	            Clip clip = AudioSystem.getClip();
	            clip.open(stream);
	            clip.start();
	            
	        } catch(Exception e) {
	            
	            e.printStackTrace();
	        }
	        
	    }      
	}

