package object;

import bit.camp.common.BizMinusException;
import bit.camp.common.BizThousandOverException;
import bit.camp.common.Calculator;


class MyClass{
	
}
public class Program {
	public static void main(String[] args) throws BizMinusException {
	
		Object o1 = new MyClass();
		
		int var=1;
		System.out.println(var);
		
		Integer var2= new Integer("1");
		System.out.println(var2.intValue());
		
	try {
		Calculator.add(-100000, 0);
		
	}catch (BizThousandOverException e) {
		System.out.println(e.toString());
	}catch(BizMinusException e){
		System.out.println(e.toString());
	}
}
}
