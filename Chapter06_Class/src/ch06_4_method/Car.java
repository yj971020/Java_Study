package ch06_4_method;

public class Car {
	//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	//���� ���� �޼ҵ�
	void setGas(int gas) { //���ϰ��� ���� �޼ҵ�, �Ű����� �޾� gas�ʵ尪 ����
		this.gas=gas;
	} 
	//���� �ܷ� ����
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas ����");
			return false;
		}
		System.out.println("gas ����");
		return true;
	}
	//����
	void run() throws InterruptedException {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� : "+gas+")"); 
				gas -=1;
				Thread.sleep(500); // ���� ������ ����
			}
			else {
				System.out.println("����ϴ�.(gas�ܷ� : "+gas+")");
				return;
			}
		}
	}
}
