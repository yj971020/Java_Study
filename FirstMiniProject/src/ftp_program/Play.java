package ftp_program;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Play {

	//오디오를 실행할수 있는 인터페이스 Clip 사용
	public static Clip c;
	
	/*
	 * 음악 번호를 받아 playmusic 실행
	 */
	public static void selectMusic(int is_mem) throws Exception {

		System.out.println("재생메뉴 입니다.");
		System.out.print("재생 하고자 하는 곡의 번호를 입력하세요 > ");

		Scanner scn = new Scanner(System.in); // 음악 번호 입력
		int sel = Integer.parseInt(scn.nextLine()); // 입력받은 값 int 로 변환
		
		System.out.println();

		if (Song.selFile(sel) == null) { // 없는 메뉴 선택시 
			System.out.print("올바른 번호를 입력해주세요.... ");
		} else {
			System.out.println("♬♪♩   " + Song.selFile(sel) + "  ♬♪♩ \n");
			Song.printSong(sel);
			//노래듣기	
			//회원 여부, 다운로드받는 폴더 경로+선택한 곡번호에 맞는 음원파일이름 받아서 실행메소드에 매개변수로 넣어줌 
			
			playmusic(is_mem,FTPClient.DOWNLOADPATH + Song.selFile(sel));
			
			
		}
	}
	

	/*
	 * 파일 경로를 받아 음악 재생
	 */

	public static void playmusic(int is_mem, String FilePath) throws Exception, IllegalMonitorStateException {
		File a = new File(FilePath);

		AudioInputStream b = AudioSystem.getAudioInputStream(a);
		c = AudioSystem.getClip();
		c.open(b);
		c.start();
		if (is_mem == 0) { // 게스트 (is_mem==0 ): 미리듣기만 가능
			System.out.println("10초 미리듣기중 .....");
			Thread.sleep(10000); // 10초 미리듣기
			stopMusic();
		} else{ // 회원(is_mem==1): 전곡듣기 , 일시정지 가능

			c.loop(c.LOOP_CONTINUOUSLY); // 음악을 반복재생

			System.out.print("\n 일시정지 : p , 재생 종료 : q  >  ");
			
			int pause = 0;
			
			while (true) { // q 입력할때까지 반복
				Scanner scanner = new Scanner(System.in);
				String quit = scanner.nextLine();

				if (quit.equalsIgnoreCase("q")) { // q 입력시 종료
					stopMusic();
					break;
				}else if (quit.equalsIgnoreCase("p")) {
					pause++; //p를 누를때마다 p 변수에 +1
					if (pause % 2 == 1) { //p 를 누른 횟수가 홀수일 경우 일시정지
						pauseMusic();
					} else { //재생 
						System.out.println("\n재생 중 .....");	
						c.start();
						System.out.print("\n일시정지 : p , 재생 종료 : q >  ");
					}
				} else { // 입력값이 p 또는 q 가 아닐경우 경고
					System.out.print("올바른 문자를 입력해주세요...> ");
				}
			}
		}
	}
	/*
	 * 음악종료
	 */
	public static void stopMusic() {
		if (c != null) {
			c.stop();
			System.out.println("음악 정지!");
		}
	}

	/*
	 * 일시정지
	 */
	public static void pauseMusic() {
		if (c != null) {
			c.stop();
			System.out.print("일시정지 ! -> 다시 재생 : p   >");
		}
	}
}
