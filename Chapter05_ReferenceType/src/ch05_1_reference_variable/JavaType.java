package ch05_1_reference_variable;

public class JavaType {

	public static void main(String[] args) {
	
//		String[][][][][][] ���ѹα�; //6���� �迭 (�迭�ȿ� �迭�ȿ� �迭�ȿ� ..)
//		//String[][][][][][][] ���ѹα� = {����, �λ�, �뱸, ��õ{ ������, ������, ���ϱ�, ...} ���� { �Ż�. ����, ,,,} -> ����Ʈ{ ����, �Ｚ, ��� ,,,} ��{101,102 ,,, } ȣ {101 102 ...}}
//		//������ �迭�̸� ���� �迭�� ���� �ּҸ� ������
//		int i=33; 
//		System.out.println(i); //33
//		
//		String[] strs = {"korea","fighting"};
//		System.out.println(strs); // �ּҰ� ����
//		System.out.println(strs[0]);

		int iv = 10;
		double dv = 10.0;
		System.out.println(iv);
		System.out.println(dv);

		//int �� 1���� �迭 ����
		int[] ar0 = new int[2]; //�� 2��¥�� 1���� �迭
		int[] ar1 = new int[3];
		ar1[2] =3;
		int[] ar2 = new int[2];
		
		System.out.println(ar0); //�ּҰ� ���
		System.out.println(ar1);
		System.out.println(ar2);
	
		//int �� ������ �迭�� ���� �迭 3�� ¥�� 2���� �迭 ����
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
		
		//���� for �� ǥ�� ..?
		
		for(int[] elements :array) {
			for(int e: elements) {
				System.out.print(e+", ");
			}
		}
	}

}
