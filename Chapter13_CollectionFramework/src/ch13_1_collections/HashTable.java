package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {

		/*
		 * [Hashtable] implements Map
		 * 
		 * HashmMap 과 동일한 내부 구조 - 동기화(synchronized )된 메소드로 구성 : 하나의 스레드가 실행 완료해야만 다른 스레드
		 * 접근 가능
		 */

		// 아이디 ,비번 검사

		Map<String, String> map = new Hashtable<String, String>();
		map.put("Spring", "12");
		map.put("summer", "123");
		map.put("fall","1234");
		map.put("winter", "12345");
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.println("아이디: ");
			String id=scan.nextLine().trim();
			System.out.println("비밀번호: ");
			String pw=scan.nextLine().trim();
			System.out.println();
			
			//ID가 없다면
			if(!map.containsKey(id)) {
				System.out.println("입력하신 ID 는 존재하지 않는 아이디입니다 .다시 입력해주세요");
			}
			//ID가 있다면
			else {
				//비번 불일치
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다 .");
					
				}
			}
			scan.close();
		}
		
	}

}
