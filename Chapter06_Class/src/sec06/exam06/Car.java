package sec06.exam06;

public class Car {

	// 필드
	private int speed;
	private boolean stop;
	// 생성자

	// 메소드
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() { //boolean 타입은 is.. 로 이름을 지어주는것이 좋음
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
