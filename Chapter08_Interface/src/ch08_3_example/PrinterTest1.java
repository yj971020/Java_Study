package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		String myDoc = "this is a report...";
		Printable prn=null;
		
		//삼성프린터 출력 검사
		prn=new SPrinterDriver();
		prn.print(myDoc);
		
		//LG프린터 출력 검사
		prn=new LPrinterDriver();
		prn.print(myDoc);
		
	}

}
//삼성 프린터 드라이버
class SPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("From samsung printer---");
		System.out.println(doc);
	}
	
}
class LPrinterDriver implements Printable{
	public void print(String doc) {
		System.out.println("From LG printer---");
		System.out.println(doc);
	}
}
