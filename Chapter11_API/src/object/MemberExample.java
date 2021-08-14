package object;

class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		//매개값이 member 타입인지 확인
		if (obj instanceof Member) {
			Member member = (Member) obj;
			//id 필드값이 동일한지 검사
			if (id.equals(member.id)) {
				return true;
			}
		}
		//매개값이 Member 타입이 아니거나 id 필드 값이 다른경우!
		return false;
	}
}

public class MemberExample {

	public static void main(String[] args) {

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj 1 과 obj 2 는 동등합니다. ");
		} else {
			System.out.println("obj 1 과 obj 2 는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj 1과 obj3 은 동등합니다.");
		} else {
			System.out.println("obj1 과 obj3 는 동등하지 않습니다.");
		}
	}

}
