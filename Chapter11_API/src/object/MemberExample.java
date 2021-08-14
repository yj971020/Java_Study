package object;

class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		//�Ű����� member Ÿ������ Ȯ��
		if (obj instanceof Member) {
			Member member = (Member) obj;
			//id �ʵ尪�� �������� �˻�
			if (id.equals(member.id)) {
				return true;
			}
		}
		//�Ű����� Member Ÿ���� �ƴϰų� id �ʵ� ���� �ٸ����!
		return false;
	}
}

public class MemberExample {

	public static void main(String[] args) {

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj 1 �� obj 2 �� �����մϴ�. ");
		} else {
			System.out.println("obj 1 �� obj 2 �� �������� �ʽ��ϴ�.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj 1�� obj3 �� �����մϴ�.");
		} else {
			System.out.println("obj1 �� obj3 �� �������� �ʽ��ϴ�.");
		}
	}

}
