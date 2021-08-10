package ch08_2_polymorphism;

public class Driver {
	public void drive(Vehicle ve) {
		if(ve instanceof Bus) {
			((Bus) ve).checkFare();
			ve.run();
		}else {
		ve.run();
	}
	}
}
