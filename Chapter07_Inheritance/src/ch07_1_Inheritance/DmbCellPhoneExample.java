package ch07_1_Inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone 객체 형성
		DmbCellPhone dmbCellPhone= new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: "+ dmbCellPhone.model);
		System.out.println("색상: "+  dmbCellPhone.color);
		
		//DmbCellPhone 클래스의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.poweron();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.reciveVoice("안녕하세요 전 김예진 인데요");
		dmbCellPhone.sendVoice("예 반가링");
		dmbCellPhone.hangup();
		
		//DmbCellPhone클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
