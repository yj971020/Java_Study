package ch02_3_type_casting;

public class CastingExample1 {
	public static void main(String[] args) {

		/*
		 * ���� (�����) ����ȯ :~ �ؼ��ϴ� ����� ��ȯ
		 */
		System.out.println((char) 65); //���: A
		
		// Ȯ�� (promotion): int ---> double �ս�(x) �ڵ�����ȯ
		// ���(Demotion) : double ---> int �ս�(o) ��������ȯ ..0.5 --> 0

		int iv = 127;
		iv = 1000000;
		// byte bv = iv; �������� ū�� ���� --> ����

		byte bv = (byte) iv;
		System.out.println(bv); // ���:64

		// (char)<--- int ... long...
		double dv = 3.14;
		iv = (int) dv;

		System.out.println(iv); // ��� :3

		System.out.println("971020"); // ���ڰ� �ƴ� ���ڿ� (string)
		// ��) ȸ�����Խ� ����ȯ�� �ʿ���

	}
}
