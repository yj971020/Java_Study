package chatting_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PMI {

	public static void printMusicInfo() {
		Scanner sc = new Scanner(System.in);
		List <Song> list = new ArrayList<>();

		int box = 4;
		//파일 디렉토리에 담긴 수만큼 객체 생성 후 ArrayList에 담아주기
		//디렉토리 수만큼 담으려 했으나, 곡정보가 모두 다를것으로 보여 수동으로 초기화함
			Song song = new Song("점점", "Brown City", "2005.02.03", "나얼");
			Song song1 = new Song("벌써일년", "Brown City", "2005.02.03", "나얼");
			Song song2 = new Song("귀로", "Brown City", "2005.02.03", "나얼");
			Song song3 = new Song("같은시간속에 너", "Brown City", "2005.02.03", "나얼");

			list.add(song);
			list.add(song1);
			list.add(song2);
			list.add(song3);

			Loop1 :while(true) {
			
			System.out.println("곡번호를 선택해 주세요. (종료는 5번) >");
				
			int input =0;
			try {
				
			input = Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1 : 
				System.out.println(list.get(input-1));
				break;
			case 2 : 
				System.out.println(list.get(input-1));
				break;
			case 3 : 
				System.out.println(list.get(input-1));
				break;
			case 4 : 
				System.out.println(list.get(input-1));
				break;
			case 5 : 
				System.out.println("종료합니다.");
				break Loop1; // Loop1의 while문으로 가서 종료 
			default :
				System.out.println("값을 다시 입력 해주세요.");
				continue;
			}
			}catch(NumberFormatException e) {
				System.out.println("숫자로 입력해주세요.");
			}
				
				
			}
	
		
		
		
	}

}
