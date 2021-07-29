package ch02_3_type_casting;

public class CastingExample2 {
	public static void main(String[] args) {
		
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);

		long longvalue = 500;
		intValue = (int) longvalue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);

	}
}
