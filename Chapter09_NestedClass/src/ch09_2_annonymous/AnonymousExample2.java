package ch09_2_annonymous;

interface Calculatable{
	public int sum();
}

class Anonymous2{
	private int field;;
	
	public void method(final int arg1 ,int arg2)
	{
		final int var1=0;
		int var2=0;
		
		field=10;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field+arg1+arg2+var1+var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
public class AnonymousExample2 {
	public static void main(String[] args) {
		Anonymous2 anony=new Anonymous2();
		anony.method(0,0);
	}

}
