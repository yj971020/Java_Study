package ch07_1_Inheritance;

public class DmbCellPhone extends CellPhone{ //DmbCellphone �� CellPhone �� �����̴�
	
	//�ʵ�
	int channel;
	
	//������
	public DmbCellPhone(String model, String color, int Channel) {
		this.model=model; //CellPhone Ŭ������ ���� ��� ���� �ʵ�
		this.color=color;
		this.channel=channel;
		
	}
	
	void turnOnDmb(){
		System.out.println("ä��"+channel+"�� DMB��� ������ �����մϴ�");
		
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ä��"+channel+"������ �ٲߴϴ�");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�");
	}

}
