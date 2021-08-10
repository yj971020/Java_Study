package ch08_2_polymorphism;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달린다");
	}

}
