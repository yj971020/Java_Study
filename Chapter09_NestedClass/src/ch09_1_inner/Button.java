package ch09_1_inner;

public class Button {
	
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
