package object;

import java.util.Arrays;

public class CloneOrg {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arrCopy = arr.clone();
		for(int i : arrCopy) {//�ݺ��ϸ� i �� �˾Ƽ� ��������
			System.out.print(i+", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arrCopy)); //�迭�� ���� �������
	}

}
