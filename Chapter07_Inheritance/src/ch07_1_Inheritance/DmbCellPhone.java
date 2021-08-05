package ch07_1_Inheritance;

public class DmbCellPhone extends CellPhone{ //DmbCellphone 은 CellPhone 의 일종이다
	
	//필드
	int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int Channel) {
		this.model=model; //CellPhone 클래스로 부터 상속 받은 필드
		this.color=color;
		this.channel=channel;
		
	}
	
	void turnOnDmb(){
		System.out.println("채널"+channel+"번 DMB방송 수신을 시작합니다");
		
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}

}
