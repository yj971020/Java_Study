package ch08_1_interface;

interface Searchable {
	public abstract void search(String url);
}

class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	private String name;

	public SmartTelevision(String name) {
		this.name = name;
	}

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println(name + "TV �� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println(name + "TV �� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + this.volume);
	}
}

public class SmartTelevisionExample {
	public static void main(String[] args) {
		
		SmartTelevision stv = new SmartTelevision("SAMSUNG smart TV");
		//�ڵ� ����ȯ (RemoteControl <----SmartTelevision)
		//RemoteControl ��ɸ�,,,
		RemoteControl rc = stv;
		rc.turnOn();
		//�ڵ� ����ȯ (Searchable <-----SmartTelevision)
		//Searchable ��ɸ�,,,
		Searchable sc = stv;
		sc.search("www.google.com");
	}

}
