package ch07_3_polymorphism_ex;

//ģ��
class Friend{
	//�ʵ�
	public String name;
	public String phone;
	
	//������
	public Friend(String na, String ph) {
		name=na;
		phone=ph;
	}
	//�޼ҵ�
	public void ShowInfo() {
	System.out.println("�̸��� : " + name);
	System.out.println("��ȭ��ȣ : " + phone);
	}
}
//����ģ��
class UnivFriend extends Friend{
	// �ʵ�
	public String major;

	// ������
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		major=ma;
	}

	// �޼ҵ�
	@Override
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("������ : " + major);		
	}
}

//���嵿��
class CompFriend extends Friend{
	// �ʵ�
	public String department;

	// ������
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;		
	}

	// �޼ҵ�
	@Override
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("�μ��� : " + department);
	}
}

public class MyFriends2 {
	public static void main(String[] args) {
		// ���� ģ���� ������ ���� �迭�� ����
		Friend[] friends =new Friend[6];
		int count=0;		
		 
		 //����ģ�� �߰�
		 friends[count++]= new UnivFriend("kim"	, "Computer", "010-1");
		 friends[count++]= new UnivFriend("lee"	, "Electronics", "010-2");
		 friends[count++]= new UnivFriend("seo"	, "Math", "010-3");
		 
		 //���嵿��
		 friends[count++]= new CompFriend("kim"	, "R&D", "010-1");
		 friends[count++]= new CompFriend("lee"	, "R&D", "010-2");
		 friends[count++]= new CompFriend("seo"	, "R&D", "010-3");
		 
		 for(int i=0;i<friends.length;i++) {
			 friends[i].ShowInfo();
			 if(friends[i].name.equals("kim")) {
				 System.out.println("kim ��"+(i+1)+"��°����"+"ã�ҽ��ϴ�."); 
			 }
			
		 }
	}
}
