package ch09_2_annonymous;

 class Button {
	
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
 class Window{
	 Button button1=new Button();
	 Button button2=new Button();
	 
	 //�ʵ� �ʱⰪ���� ����
	 Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);//�Ű������� �ʵ� ����
		//�Ű������� �͸� ��ü ����
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");
			}
		});
	}
 }

public class ButtonExample {
	public static void main(String[] args) {
		Window w=new Window();
		w.button1.touch();
		w.button2.touch();
	}

}
