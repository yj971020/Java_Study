package object;

class Value{
	int value;
	public boolean equals(Object obj) { // 이부분을 써줘야 System.out.println(v1.equals(v2)); 가 true 나옴
		if(this.value==((Value)obj).value) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public Value (int value) {
		this.value=value;
	}
}

public class ObjectOrg {

	public static void main(String[] args) {
		Value v1 = new Value(701021);
		Value v2=new Value(701021);

		System.out.println(v1 instanceof Value); //true
		System.out.println(v2 instanceof Value); //true
		
		System.out.println(v1); //v1.toString() 이 실행된것과 같음 
		System.out.println(v1.toString());
		System.out.println(v2);
		
		
		System.out.println(v1==v2); //false : 두개의 참조값(주소값) 이 다르다
		
		System.out.println(System.identityHashCode(v1)); //고유한 식별자 (찐 주소?)
		System.out.println(System.identityHashCode(v2));
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2)); 
	}

}
