package ch09_3_example;


	interface Readable{
		void read(String s);
	}
//	class Reader implements Readable{
//
//		@Override
//		public void read(String s) {
//			System.out.println("\""+s+"\""+"��(��) �д´�.");
//		}
//		
//	}
	public class Lambda2 {
		public static void main(String[] args) {
			
//			Readable r1=new Reader();
			//�߷��� ������ �κе� ��� ����
			Readable r1=(String s)-> {System.out.println("\""+s+"\""+"��(��) �д´�.");};
			
			r1.read("What is Lambda");
		}

	}


