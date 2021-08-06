package ch07_3_polymorphism_ex;

class Cake {
	public void Sweet() {System.out.println("Cake.sweet()");}
	public void send()	{System.out.println("Cake sending....");} //배송기능
}
class CheeseCake extends Cake {
	public void milky() {System.out.println("CheeseCake.milky()");} 
	@Override
	public void send() {System.out.println("CheeseCake sending....");}
}

class StrawberryCheeseCake extends CheeseCake {
	public void sour() {System.out.println("StrawberryCheeseCake.sour()");	}
	@Override
	public void send() {System.out.println("StrqwberryCheeseCake sending.....");}
}

public class CakeControlCode {
		public static void main(String[] args) {
			
			//"StrawberryCheeseCake 인스턴스는 Cake 과 CheeseCake 의 인스턴스 이다.
			Cake cake1 =new StrawberryCheeseCake(); 
			CheeseCake cake2 = new StrawberryCheeseCake();
			
			cake1.Sweet(); // cake1 은 Cake 안에있는것만 참조 할 수 있다.
			cake2.milky(); // cake2 는 sweet, milky 에 접근 가능
			cake2.Sweet();
			
			/**
			 * 참조변수 간 대입과 형변환
			 */
			CheeseCake ca1 = new CheeseCake();
			Cake ca2=ca1;
			
			Cake ca3 = new CheeseCake();
		//	CheeseCake ca4= ca3; 불가능 : 이미 위에서 c3 는 Cake 형으로 형변환 된 상태이기 때문.
			CheeseCake ca4= (CheeseCake)ca3; //강제 형변환
			
			/*
			 * 일괄 처리( 배열관점에서 정리)
			 */
			Cake[] cakes = new Cake[3];	 // 참조를 넣음 
			
			cakes[0] = new Cake();
			cakes[1]=new CheeseCake();
			cakes[2] = new StrawberryCheeseCake();
					
			for(int i=0; i<cakes.length;i++) {
				//cakes[i] = new CheeseCake(); // 이 과정을 안거치고 아랫줄 실행하면 안됨. cakes 의 각 방에 CheeseCake 의 객체를 넣어줘야 함
				cakes[i].send();
			}
			}
		}

	

