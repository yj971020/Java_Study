package ch07_1_Inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone= new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: "+ dmbCellPhone.model);
		System.out.println("����: "+  dmbCellPhone.color);
		
		//DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.poweron();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.reciveVoice("�ȳ��ϼ��� �� �迹�� �ε���");
		dmbCellPhone.sendVoice("�� �ݰ���");
		dmbCellPhone.hangup();
		
		//DmbCellPhoneŬ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
