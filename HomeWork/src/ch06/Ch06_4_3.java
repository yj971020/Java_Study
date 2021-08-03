package ch06;

class MemberService{

	boolean login(String id, String password) {
		if(id=="hong" && password=="12345" ) {
			return true;
		}else
		{
			return false;
		}
	}
		void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
		}
	
	
}

public class Ch06_4_3 {

	public static void main(String[] args) {
	
		MemberService ms=new MemberService();
		boolean result = ms.login("hong", "12345");	
		if(result) {
			System.out.println("로그인 되었습니다");
			ms.logout("hong");
		}else
		{
			System.out.println("id 또는 password 가 올바르지 않습니다.");
		}
		
	
		

	}

}
