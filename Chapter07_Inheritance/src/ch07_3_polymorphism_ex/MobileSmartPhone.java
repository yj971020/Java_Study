package ch07_3_polymorphism_ex;

class MobilePhone {
	// �ʵ�
	protected String number; // ��ȭ��ȣ

	// ������
	public MobilePhone(String num) {
		this.number = num;
	}

	// �޼ҵ�
	public void receive() {
		System.out.println("Hi~from :" + this.number);
	}
}

class SmartPhone extends MobilePhone {
	// �ʵ�
	private String androidVer; // �ܺο��� ������������

	// ������
	public SmartPhone(String num, String ver) { // �θ� �������� �Ű������� �޾ƿ;���(String num)
		super(num); // �θ𲨸� ���ʿ� �������
		androidVer = ver;
	}

	// �޼ҵ�
	public void send(String number) {
		System.out.println("Hello~ to :" + number);
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}

	@Override
	public void receive() {
		super.receive();
		System.out.println("I am Smart");
	}

}

public class MobileSmartPhone {
	public static void main(String[] args) {
		// ����Ʈ�� ��ü ����
		SmartPhone phone1 = new SmartPhone("010-1234-5678", "Andriod 7.0");

		// �θ� Ŭ������ ��������(phone2) �� �ڽ� Ŭ������ (SmartPhone) �� �ν��Ͻ��� ���� ���� !!***
		// �ڵ� ����ȯ �Ͼ ->but �θ����� �޼ҵ� �ۿ� ���� ����
		MobilePhone phone2 = new SmartPhone("010-2222-3333", "Ios 14.7.1");

		// ��ȭ�ɱ�
		phone1.send("010-1111-1111");
		// phone2.send("010-1111-1111");�Ұ���
		
		// ��ȭ�ޱ�
		phone1.receive();
		phone2.receive();
		
		//���� �����Ͽ� �����ϱ�
		phone1.playApp();
		//phone2.playApp(); �Ұ���

	}
}
