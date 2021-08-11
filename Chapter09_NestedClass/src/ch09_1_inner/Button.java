package ch09_1_inner;

public class Button {
	
	OnClickListener listener ; // �������̽� Ÿ���ʵ�
	
	//�Ű������� ������
	void setOnClickListener (OnClickListener listener) {
		this.listener=listener;
	}
	//���� ��ü�� onclick �޼ҵ� ȣ��
	void touch() {
		listener.onClick();
	}
	//��ø �������̽�
	static interface OnClickListener {
		void onClick();
	}

}
