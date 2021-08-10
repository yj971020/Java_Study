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
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println(name + "TV 를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println(name + "TV 를 끕니다.");
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
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
}

public class SmartTelevisionExample {
	public static void main(String[] args) {
		
		SmartTelevision stv = new SmartTelevision("SAMSUNG smart TV");
		//자동 형변환 (RemoteControl <----SmartTelevision)
		//RemoteControl 기능만,,,
		RemoteControl rc = stv;
		rc.turnOn();
		//자동 형변환 (Searchable <-----SmartTelevision)
		//Searchable 기능만,,,
		Searchable sc = stv;
		sc.search("www.google.com");
	}

}
