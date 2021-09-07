package ftp_program;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Person {

	private static String id;
	private String name;
	private String password;
	public Person p;
	public static List<Board> song1 = new LinkedList<>();
	public static List<Board> song2 = new LinkedList<>();
	public static List<Board> song3 = new LinkedList<>();
	public static List<Board> song4 = new LinkedList<>();

	private static Map<String, Person> map = new HashMap<String, Person>();
	private static Map<String, String> account = new HashMap<String, String>();

	static Scanner sc = new Scanner(System.in);

	public Person() {
	}

//	<<<<Person 생성자는 두개의 값을 넣어줘야합니다.>>>>	
//	sign 메서드에서 Person 객체를 만들어줍니다.	
	Person(String name, String password) {
		this.name = name;
		this.password = password;
	}

//	<<<<회원가입하는 메서드 입니다.>>>>	
	public void sign() {

		System.out.print("\n이름을 입력하세요. > ");
		this.name = sc.nextLine(); // 이름을 세팅합니다. map의 키값 으로들어갑니다.

		System.out.print("아이디를 입력하세요. > ");
		this.id = sc.nextLine(); // 아이디를 세팅합니다.

		System.out.print("패스워드를 입력하세요. > ");
		this.password = sc.nextLine(); // 패스워드를 세팅합니다..

		p = new Person(name, password); // Person 객체를 생성합니다.
										// 입력한 아이디와 패스워드 매개변수로 넣어줍니다.

		addPerson(p); // 생성된 Person객체를 맵핑해주는 매서드입니다.

	}

//	<<<<매핑해주는 매서드입니다.>>>>	
	public void addPerson(Person person) {

		// sing 메서드를 실행해서 세팅한 name을 key로, Person객체를 value로 넣어줍니다.
		map.put(id, person);

	}

//	<<<<회원의 모든 정보를 출력하는 메서드>>>>	
//	모든 회원정보를 출력합니다.
//	스캐너로 입력받은 String이 map의 키값과 동일하다면 아이디 비번 출력.	
	public void showAll() {

		System.out.println("검색할 ID");
		String id = sc.nextLine(); // 스캐너로 받아오는 id를 map<K,V> 의 K와 비교합니다.

		Person person = map.get(id);

		if (person == null) {
			System.out.println(id + "가 존재하지 않습니다.");
		} else {
			System.out.println("이름은 : " + person.getName() + ", ID : " + id + ", password : " + person.getPassword());
		}

	}

//	<<<<로그인 메서드>>>>	
	public int login() {

		while (true) {

			System.out.print("\n아이디를 입력해 주세요 > "); // id를 입력받습니다.
			String id = sc.nextLine();

			// 입력받은 id가 map의 key값과 동일한지 비교합니다.
			if (map.containsKey(id)) {

				// 비밀번호를 입력받습니다.
				System.out.print("비밀번호를 입력해 주세yo > ");
				String pw = sc.nextLine();

				// 입력받은 비밀번호가 맞으면 true 아니면 false
				boolean b = pw.equals(map.get(id).getPassword());

				if (b) {
					System.out.println("********** 로그인 성공하셨습니다. **********");
					return 1;
				} else {
					System.out.println("********** 비밀번호가 틀렸습니다. **********");
					return 0;
				}
			} else {
				System.out.println("********** 아이디가 없습니니다. **********");
				return 0;
			}
		}

	}

	public static void writeComment() {
//		Person p = new Person();
//		
//		System.out.println("닉네임을 입력해주세요 : ");
//		String nickName = sc.nextLine();

		System.out.println("코멘트를 입력해 주세요 : ");
		String comment = "";
		comment = sc.nextLine();

		account.put(id, comment);
	}

	public static void showComment2(int a) {

		String s = "";
		Set<String> keys = map.keySet();
		for (String key : keys) {
			s = "[" + key + "] 님의 코멘트: \"" + account.get((String) key.toString()) + "\"";
		}

//		int input = Song.printSong(FTPClient.A);

		if (a == 1) {

			Board board = new Board();
			switch (FTPClient.A) {
			case 1:
				board.setSong(s);
				song1.add(board);
				for (Board a1 : song1) {
					System.out.println(a1);
				}
				break;
			case 2:
				board.setSong(s);
				song2.add(board);
				for (Board a2 : song2) {
					System.out.println(a2);
				}
				break;
			case 3:
				board.setSong(s);
				song3.add(board);
				for (Board a3 : song3) {
					System.out.println(a3);
				}
				break;
			case 4:
				board.setSong(s);
				song4.add(board);
				for (Board a4 : song4) {
					System.out.println(a4);
				}
				break;
			default:
				break;
			}
		} else {
			switch (FTPClient.A) {
			case 1:
				for (Board a1 : song1) {
					System.out.println(a1);
				}
			case 2:
				for (Board a2 : song2) {
					System.out.println(a2);
				}

			case 3:
				for (Board a3 : song3) {
					System.out.println(a3);
				}
			case 4: 
				for (Board a4 : song4) {
					System.out.println(a4);
				}
			}
		}
	}

	public static int reviewOrNo() {

		try {

			System.out.println("리뷰를 남기겠습니까.? <<< 1.예 / 2.아니오 >>> ");
			String yn = sc.nextLine();
			int in = Integer.parseInt(yn);
			if (in == 1) {
				writeComment();
				return 1;
			} else if (in == 2) {
				return 0;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}

		} catch (NumberFormatException e) {
			System.out.println("잘못 입력하셨습니다.");
		}
		return 0;
	}

	// 게터 세터.
	public static String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
