package ch09_3_example;

interface Printable {
	void print();
}

class Papers {
	private String contents;

	public Papers(String s) {
		contents = s;
	}

	public Printable getPrinter() {
		return new Printable() { //바로 리턴
			
			@Override
			public void print() {
				System.out.println(Papers.this.contents);
			}
		};
	}

}

public class UserLocalInner {
	public static void main(String[] args) {
		Papers papers=new Papers("my doc2");
		Printable prn=papers.getPrinter();
		prn.print();
	}

}
