package ch08_3_example;

interface NewPrintable{
	void print(String doc); //�ݵ�� ����
	default void printCMYK(String doc) { //���û���
	}
}
//���� ��� ������
class OldDriver implements NewPrintable{

	@Override
	public void print(String doc) {
		System.out.println("oldDriver ����Ʈ");
	}
	
}
//���ο� �÷�������
class NewDriver implements NewPrintable{

	@Override
	public void print(String doc) {
	System.out.println("newDriver ��� ����Ʈ");
	}
	public void printCMYK(String doc) {
		System.out.println("newDriver �÷� ����Ʈ");
		
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
