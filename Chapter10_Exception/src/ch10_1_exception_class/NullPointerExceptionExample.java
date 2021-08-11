package ch10_1_exception_class;

public class NullPointerExceptionExample {
	public static void main(String[] args) {

		String data1;
		String data2 = null;
		String data3 = "";
		String data4 = " ";

		try {
			System.out.println(data2.length());
		} catch (NullPointerException e) {
			System.out.println("e.toString() : "+e.toString());
			System.out.println("e.getMessage() : "+e.getMessage());
			System.out.println("e.printStackTrace() ");
		}catch(Exception e) { // 모든 예외의 조상 : Exception
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}