package object;

class Value{
	int value;
	public boolean equals(Object obj) { // �̺κ��� ����� System.out.println(v1.equals(v2)); �� true ����
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
		
		System.out.println(v1); //v1.toString() �� ����ȰͰ� ���� 
		System.out.println(v1.toString());
		System.out.println(v2);
		
		
		System.out.println(v1==v2); //false : �ΰ��� ������(�ּҰ�) �� �ٸ���
		
		System.out.println(System.identityHashCode(v1)); //������ �ĺ��� (�� �ּ�?)
		System.out.println(System.identityHashCode(v2));
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2)); 
	}

}
