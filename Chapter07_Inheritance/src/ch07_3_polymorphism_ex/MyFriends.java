//package ch07_3_polymorphism_ex;
//
////대학친구
//class UnivFriend {
//	// 필드
//	private String name;
//	private String major;
//	private String phone;
//
//	// 생성자
//	public UnivFriend(String na, String ma, String ph) {
//		name = na;
//		major=ma;
//		phone = ph;
//	}
//
//	// 메소드
//	public void ShowInfo() {
//		System.out.println("이름은 : " + name);
//		System.out.println("전공은 : " + major);
//		System.out.println("전화번호 : " + phone);
//	}
//}
//
////직장동료
//class CompFriend {
//	// 필드
//	private String name;
//	private String department;
//	private String phone;
//
//	// 생성자
//	public CompFriend(String na, String de, String ph) {
//		name = na;
//		department = de;
//		phone = ph;
//	}
//
//	// 메소드
//	public void ShowInfo() {
//		System.out.println("이름은 : " + name);
//		System.out.println("부서는 : " + department);
//		System.out.println("전화번호 : " + phone);
//	}
//}
//
//public class MyFriends {
//	public static void main(String[] args) {
//		// 대학 친구의 관리를 위한 배열과 변수
//		UnivFriend[] uf=new UnivFriend[3];
//		int uc=0;
//		
//		//직장 동료의 관리를 위한 배열과 변수
//		CompFriend[] cf=new CompFriend[3];
//		int cc=0;
//		
//		 
//		 //대학친구 추가
//		 uf[uc++]= new UnivFriend("kim"	, "Computer", "010-1");
//		 uf[uc++]= new UnivFriend("lee"	, "Electronics", "010-2");
//		 uf[uc++]= new UnivFriend("seo"	, "Math", "010-3");
//		 
//		 //직장동료
//		 cf[cc++]= new CompFriend("kim"	, "R&D", "010-1");
//		 cf[cc++]= new CompFriend("lee"	, "R&D", "010-2");
//		 cf[cc++]= new CompFriend("seo"	, "R&D", "010-3");
//		 
//		 for(int i=0;i<uf.length;i++) {
//			 uf[i].ShowInfo();
//		 }
//		 for(int i=0;i<cf.length;i++) {
//			 cf[i].ShowInfo();
//		 }
//		 
//				 
//		 
//				 
//		
//	}
//
//}
