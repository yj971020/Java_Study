package ch05_1_reference_variable;

public class JavaType {

	public static void main(String[] args) {
	
//		String[][][][][][] 대한민국; //6차원 배열 (배열안에 배열안에 배열안에 ..)
//		//String[][][][][][][] 대한민국 = {서울, 부산, 대구, 인천{ 강남구, 강서구, 강북구, ...} 강남 { 신사. 역삼, ,,,} -> 아파트{ 현대, 삼성, 대우 ,,,} 동{101,102 ,,, } 호 {101 102 ...}}
//		//각각이 배열이며 각각 배열의 시작 주소를 갖고있
//		int i=33; 
//		System.out.println(i); //33
//		
//		String[] strs = {"korea","fighting"};
//		System.out.println(strs); // 주소값 나옴
//		System.out.println(strs[0]);

		int iv = 10;
		double dv = 10.0;
		System.out.println(iv);
		System.out.println(dv);

		//int 형 1차원 배열 생성
		int[] ar0 = new int[2]; //방 2개짜리 1차원 배열
		int[] ar1 = new int[3];
		ar1[2] =3;
		int[] ar2 = new int[2];
		
		System.out.println(ar0); //주소값 출력
		System.out.println(ar1);
		System.out.println(ar2);
	
		//int 형 일차원 배열을 갖는 배열 3개 짜리 2차원 배열 생성
		int[][] array=new int[3][];
		//int[][] array= {ar0,ar1,ar2};
			
		array[0]=ar0;
		array[1]=ar1;
		array[2]=ar2;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++)
			{
				System.out.println("array"+"["+i+"]"+"["+j+"]"+array[i][j]);
			}
		}	
		
		//향상된 for 문 표현 ..?
		
		for(int[] elements :array) {
			for(int e: elements) {
				System.out.print(e+", ");
			}
		}
	}

}
