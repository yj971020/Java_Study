package ch07_3_polymorphism_ex;

//친구
class Friend{
	//필드
	public String name;
	public String phone;
	
	//생성자
	public Friend(String na, String ph) {
		name=na;
		phone=ph;
	}
	//메소드
	public void ShowInfo() {
	System.out.println("이름은 : " + name);
	System.out.println("전화번호 : " + phone);
	}
}
//대학친구
class UnivFriend extends Friend{
	// 필드
	public String major;

	// 생성자
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		major=ma;
	}

	// 메소드
	@Override
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("전공은 : " + major);		
	}
}

//직장동료
class CompFriend extends Friend{
	// 필드
	public String department;

	// 생성자
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;		
	}

	// 메소드
	@Override
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("부서는 : " + department);
	}
}

public class MyFriends2 {
	public static void main(String[] args) {
		// 대학 친구의 관리를 위한 배열과 변수
		Friend[] friends =new Friend[6];
		int count=0;		
		 
		 //대학친구 추가
		 friends[count++]= new UnivFriend("kim"	, "Computer", "010-1");
		 friends[count++]= new UnivFriend("lee"	, "Electronics", "010-2");
		 friends[count++]= new UnivFriend("seo"	, "Math", "010-3");
		 
		 //직장동료
		 friends[count++]= new CompFriend("kim"	, "R&D", "010-1");
		 friends[count++]= new CompFriend("lee"	, "R&D", "010-2");
		 friends[count++]= new CompFriend("seo"	, "R&D", "010-3");
		 
		 for(int i=0;i<friends.length;i++) {
			 friends[i].ShowInfo();
			 if(friends[i].name.equals("kim")) {
				 System.out.println("kim 을"+(i+1)+"번째에서"+"찾았습니다."); 
			 }
			
		 }
	}
}
