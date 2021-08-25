package SoundCloud;


	import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;
	
	
	  public class Test { 
		  
		  public static void main(String[] args) throws Exception {
			selectMusic(2);
		}
		  public static void selectMusic(int sel) throws Exception { //sel: 클라이언트가 선택한 번호를 받고 음악 재생
				
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
		  
	    public static void Frame(String path){
	    	
	            
	        JFrame f = new JFrame("음악재생"); 
	        
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setLocationRelativeTo(null);
	        f.setSize(300,300);
	        f.setVisible(true);   
	        JLabel label = new JLabel(path);
	          
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

