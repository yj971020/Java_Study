package object;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1=System.nanoTime(); // 시작시간 읽기
		
		int sum =0;
		for(int i=1;i<= 100000; i++) {
			sum+=i;
		}
		long time2=System.nanoTime(); //끝시간 읽기
		  System.out.println("1~100000까지의 합 : "+sum);
		  System.out.println("계산에 "+(time2-time1)+"나노 초가 소요되었습니다.");
	}

}
