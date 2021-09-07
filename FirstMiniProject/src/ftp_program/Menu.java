package ftp_program;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heart();
		menuDisplay();
		 showFileList();
		 showMusicList();
	}
	public static void heart () {
		 System.out.println("");
        System.out.printf("                                  ♬♬                   ♬♬                                       \n");
        System.out.printf("                               ♬       ♬           ♬      ♬                               \n");
        System.out.printf("                             ♬            ♬    ♬           ♬                        \n");
        System.out.printf("                            ♬                ♬    	       ♬                      \n");
        System.out.printf("                             ♬                                 ♬                      \n");
        System.out.printf("                              ♬     메뉴를 선택 해주세요.    ♬                              \n");
        System.out.printf("                                 ♬                         ♬                      \n");
        System.out.printf("                                   ♬                    ♬                     \n");
        System.out.printf("                                       ♬            ♬                    \n");  
        System.out.printf("                                          ♬      ♬                  \n");  
        System.out.printf("                                              ♬                    \n");  
	}
	public static void menuDisplay() {	
		System.out.println("");
		System.out.println("");
		System.out.println("                     [1] 음원 재생");
		System.out.println("");
		System.out.println("                     [2] 다운로드");
		System.out.println("");
		System.out.println("                     [3] 곡 정보출력");
		System.out.println("");
		System.out.println("                     [4] 프로그램 종료 ");
		System.out.println("");
 		System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
		System.out.print("♡선택 >");
	}
	   public static void showFileList() {
	 		System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
	 		System.out.println(""); 
	 		System.out.println("\t:\t:\t\t♥~받고 싶은 파일의 번호를 입력해 주세요.~♥\t\t:\t:" );
	 		System.out.println("\t:\t☆\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t☆\t:");
	 		System.out.println("\t★\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t★");
	 		System.out.println("                          [1] africa-toto.wav");
	 		System.out.println("");
	 		System.out.println("                          [2] around_the_world-atc.wav");
	 		System.out.println("");
	 		System.out.println("                          [3] dont_speak-no_doubt.wav" );
	 		System.out.println("");
	 		System.out.println("                          [4] evangeline-matthew_sweet.wav\"");
	 		System.out.println("");
	 		System.out.print("♡선택 >");
	 	}
	   public static void showMusicList(){
	    	
	 		System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.println("");
			System.out.println("\t\t:\t:\t:\t ♥ ~음원 리스트 입니다~ ♥\t:\t:\t:");
			System.out.println("\t\t:\t:\t☆\t\t\t\t\t☆\t:\t:");
			System.out.println("\t\t:\t★\t\t\t\t\t\t\t★\t:");
			System.out.println("\t\t☆\t\t\t\t\t\t\t\t\t☆");
			System.out.println("\t\t\t\t\t[1] Africa ");
			System.out.println("");
			System.out.println("\t\t\t\t\t[2] Around The World ");
			System.out.println("");
			System.out.println("\t\t\t\t\t[3] Sweet ");
			System.out.println("");
			System.out.println("\t\t\t\t\t[4] Don't Speak");
			System.out.println("");
			System.out.println("");
			System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.print("♡선택 >");
		}
	   public static void dundunDance() {
	       System.out.println("                              ⊂_ ");
	       System.out.println("　                               ＼＼ Λ＿Λ");
	       System.out.println("　                                 ＼ ( 'ㅅ' ) 둠칫");
	       System.out.println("　　                                 >　⌒ ");
	       System.out.println("　                                    / 　 へ＼");
	       System.out.println("                                     /　 /　 ＼＼ 두둠칫               ");
	       System.out.println("                                    | 　  ノ　　   _つ");
	       System.out.println("　                                 /　/|  ");
	       System.out.println("　                                 (　(   두둠칫");
	       System.out.println("　                                 |　| 、＼");
	       System.out.println("　                                 |  / ＼ ⌒)");
	       System.out.println("                    　             | |　　) /");
	       System.out.println("                                   ノ )　　L ");
	       System.out.println("");
	     }

}
