package object;


class A {
	char ch;
	public A(char ch) {
		this.ch=ch;
	}
}
public class StringOrg {

	public static void main(String[] args) {
		A type1=new A('��');
		A type2=new A('��');
		
		System.out.println(type1);
		System.out.println(type2);
		
		System.out.printf("%x \n",type1.hashCode()); //16����
		System.out.printf("%x \n",type2.hashCode()); 
		
		String str = "korea";
		System.out.println(str.equals("korea"));


	}

}
