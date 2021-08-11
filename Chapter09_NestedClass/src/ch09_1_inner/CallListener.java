package ch09_1_inner;


public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
