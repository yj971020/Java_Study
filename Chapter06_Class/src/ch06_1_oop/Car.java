package ch06_1_oop;

public class Car {
	//�ʵ�
	String company="�����ڵ���";
	String model ;
	String color ;
	int maxSpeed;
	int speed;
	
	Car(){
		 //������
	}
	
	//������ �����ε� : 
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
