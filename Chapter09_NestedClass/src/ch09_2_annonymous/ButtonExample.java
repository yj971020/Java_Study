package ch09_2_annonymous;

 class Button {
	
	OnClickListener listener ; // 인터페이스 타입필드
	
	//매개변수의 다형성
	void setOnClickListener (OnClickListener listener) {
		this.listener=listener;
	}
	//구현 객체의 onclick 메소드 호출
	void touch() {
		listener.onClick();
	}
	//중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}

}
 class Window{
	 Button button1=new Button();
	 Button button2=new Button();
	 
	 //필드 초기값으로 대입
	 Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);//매개값으로 필드 대입
		//매개값으로 익명 객체 대입
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
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
