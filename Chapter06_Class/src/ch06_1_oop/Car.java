package ch06_1_oop;

public class Car {
	//필드
	String company="현대자동차";
	String model ;
	String color ;
	int maxSpeed;
	int speed;
	
	Car(){
		 //생성자
	}
	
	//생성자 오버로딩 : 
	Car(String model){
		this.model=model;
	}
	Car(String model, String color) {
		
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color,int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed =maxSpeed;
	}

}
