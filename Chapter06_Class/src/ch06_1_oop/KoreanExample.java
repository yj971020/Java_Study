package ch06_1_oop;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("±è¿¹Áø", "971020-22222222");
		System.out.println("k1.ssn: " + k1.ssn);
		System.out.println("k1.name: " + k1.name);

		Korean k2 = new Korean("±èÁ¤¿¬", "701120-22222222");
		System.out.println("k2.ssn: " + k2.ssn);
		System.out.println("k2.name: " + k2.name);

	}

}
