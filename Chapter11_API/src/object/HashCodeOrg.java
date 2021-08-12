package object;

public class HashCodeOrg {

	public static void main(String[] args) {
		String str1=new String("abc");
		String str2= new String("abc");
		
		System.out.println(str1==str2); //false
		System.out.println("abc"=="abc"); //true
		
		/*
		 *String 클래스는 문자열의 내용이 같으면,
		 * 동일한 해시코드를 반환하도록 오버라이딩되어있음 
		 */
		System.out.println(str1.hashCode()); //아래와 같은값
		System.out.println(str2.hashCode());
		
		/*
		 * Object클래스의 hashCode() 와 동일
		 * 객체의 주소값으로 해시코드를 생성
		 */
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}

}
