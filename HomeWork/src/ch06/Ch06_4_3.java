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
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
	
	
}

public class Ch06_4_3 {

	public static void main(String[] args) {
	
		MemberService ms=new MemberService();
		boolean result = ms.login("hong", "12345");	
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			ms.logout("hong");
		}else
		{
			System.out.println("id �Ǵ� password �� �ùٸ��� �ʽ��ϴ�.");
		}
		
	
		

	}

}
