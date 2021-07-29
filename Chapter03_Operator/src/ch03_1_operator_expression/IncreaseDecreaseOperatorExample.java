package ch03_1_operator_expression;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;

		System.out.println("-----------------");
		x++;
		++x;
		System.out.println("x: " + x);
		// System.out.printf("x=%d\n",x);

		System.out.println("-----------------");
		y--;
		--y;
		System.out.println("y: " + y);

		System.out.println("-----------------");
		z = x++; // 현재의 x 값을 z에 저장한 이후에 x=x+1;
		System.out.println("z: " + z);
		System.out.println("x: " + x);

		System.out.println("-----------------");
		z = ++x;
		System.out.println("z: " + z);
		System.out.println("x: " + x);

		System.out.println("-----------------");
		z = ++x + y++;
		System.out.println("z: " + z);
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}
