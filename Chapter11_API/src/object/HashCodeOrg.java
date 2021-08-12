package object;

public class HashCodeOrg {

	public static void main(String[] args) {
		String str1=new String("abc");
		String str2= new String("abc");
		
		System.out.println(str1==str2); //false
		System.out.println("abc"=="abc"); //true
		
		/*
		 *String Ŭ������ ���ڿ��� ������ ������,
		 * ������ �ؽ��ڵ带 ��ȯ�ϵ��� �������̵��Ǿ����� 
		 */
		System.out.println(str1.hashCode()); //�Ʒ��� ������
		System.out.println(str2.hashCode());
		
		/*
		 * ObjectŬ������ hashCode() �� ����
		 * ��ü�� �ּҰ����� �ؽ��ڵ带 ����
		 */
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}

}
