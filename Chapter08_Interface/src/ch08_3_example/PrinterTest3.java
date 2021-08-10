package ch08_3_example;

//���ο� �÷������� ����
//���ο� ����̹� �����
class SP9600CDriver implements ColorPrintable, Printable{

	@Override
	public void printCMYK(String doc) {
		System.out.println("[Samsung SP9600CDriver] �÷� ���");
		System.out.println(doc+"\n");
	}

	@Override
	public void print(String doc) {
		System.out.println("[Samsung SP9600CDriver] ��� ��� ");
		System.out.println(doc+"\n");
	}
	}
	

public class PrinterTest3 {
	public static void main(String[] args) {
		String myDoc="this is a report...";
		ColorPrintable prn = new SP9600CDriver();
		
		prn.printCMYK(myDoc);
		prn.print(myDoc);
		
	}

}
