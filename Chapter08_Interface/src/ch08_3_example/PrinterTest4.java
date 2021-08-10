package ch08_3_example;

interface NewPrintable{
	void print(String doc); //반드시 구현
	default void printCMYK(String doc) { //선택사항
	}
}
//기존 흑백 프린터
class OldDriver implements NewPrintable{

	@Override
	public void print(String doc) {
		System.out.println("oldDriver 프린트");
	}
	
}
//새로운 컬러프린터
class NewDriver implements NewPrintable{

	@Override
	public void print(String doc) {
	System.out.println("newDriver 흑백 프린트");
	}
	public void printCMYK(String doc) {
		System.out.println("newDriver 컬러 프린트");
		
	}
	
}
public class PrinterTest4 {
	public static void main(String[] args) {
	
	
	String myDoc="this is a report...";
	NewPrintable prn ;
	prn=new OldDriver();
	prn.print(myDoc);
	prn=new NewDriver();
	prn.printCMYK(myDoc);
	prn.print(myDoc);
}
}
