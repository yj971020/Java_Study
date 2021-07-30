package ch06_1_oop;

public class Student {
		
		int num;
					
		Student(){  //생성자: 호출당하면 실행하고 빠져나감
			num=100;
		}
		
		public int getNum() {
			return num;
		}
		
		public void setNum(int num) {
			this.num=num;
		}
	}
//		Contact con = new Contact();
//		con.setName("김자바");
//
//	}
//}
//	class Contact {
//
//		String emailAddress;
//		String faxNumber;
//		String name;
//
//		public String getEmailAddress() {
//			return emailAddress;
//		}
//
//		public String getFaxNumber() {
//			return faxNumber;
//		}
//
//		public void setFaxNumber(String faxNumber) {
//			this.faxNumber = faxNumber;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public void setEmailAddress(String emailAddress) {
//			this.emailAddress = emailAddress;
//		}
	
