package ch07_1_Inheritance;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // <-�θ������ ȣ��
		this.studentNo = studentNo;
	}

}
