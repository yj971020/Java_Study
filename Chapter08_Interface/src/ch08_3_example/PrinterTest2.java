package ch08_3_example;

class sp123Driver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("samsung sp1234Driver Printing...");
		System.out.println(doc+"\n");
	}
	
}
class LP870Driver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("LG SP870Driver printing");
		System.out.println(doc+"\n");
	}
			
}
public class PrinterTest2 {
	public static void main(String[] args) {
		String myDoc = "this is a report...";
		Printable prn=null;
		
		prn = new sp123Driver();
		prn.print(myDoc);
		prn = new LP870Driver();
		prn.print(myDoc);
		
	}

}
