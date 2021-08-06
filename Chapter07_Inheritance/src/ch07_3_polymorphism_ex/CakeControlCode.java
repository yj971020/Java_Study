package ch07_3_polymorphism_ex;

class Cake {
	public void Sweet() {System.out.println("Cake.sweet()");}
	public void send()	{System.out.println("Cake sending....");} //��۱��
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
			
			//"StrawberryCheeseCake �ν��Ͻ��� Cake �� CheeseCake �� �ν��Ͻ� �̴�.
			Cake cake1 =new StrawberryCheeseCake(); 
			CheeseCake cake2 = new StrawberryCheeseCake();
			
			cake1.Sweet(); // cake1 �� Cake �ȿ��ִ°͸� ���� �� �� �ִ�.
			cake2.milky(); // cake2 �� sweet, milky �� ���� ����
			cake2.Sweet();
			
			/**
			 * �������� �� ���԰� ����ȯ
			 */
			CheeseCake ca1 = new CheeseCake();
			Cake ca2=ca1;
			
			Cake ca3 = new CheeseCake();
		//	CheeseCake ca4= ca3; �Ұ��� : �̹� ������ c3 �� Cake ������ ����ȯ �� �����̱� ����.
			CheeseCake ca4= (CheeseCake)ca3; //���� ����ȯ
			
			/*
			 * �ϰ� ó��( �迭�������� ����)
			 */
			Cake[] cakes = new Cake[3];	 // ������ ���� 
			
			cakes[0] = new Cake();
			cakes[1]=new CheeseCake();
			cakes[2] = new StrawberryCheeseCake();
					
			for(int i=0; i<cakes.length;i++) {
				//cakes[i] = new CheeseCake(); // �� ������ �Ȱ�ġ�� �Ʒ��� �����ϸ� �ȵ�. cakes �� �� �濡 CheeseCake �� ��ü�� �־���� ��
				cakes[i].send();
			}
			}
		}

	

