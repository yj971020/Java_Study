package ch13_3_example;

import java.util.HashSet;
import java.util.Set;

public class LottoGenExample {

	static final int MAX=45;
		static final int COUNT=6;	
		
	public static void main(String[] args) {
	/*
	 * �ζǹ�ȣ ������
	 * 
	 * �ߺ����� ���� �ʴ� HASHSET�̿�
	 */	
	
		//������ ��ȣ ����
		Set<Integer> set=new HashSet<>(COUNT);//6�� ���� �����ϱ� ���� ����
		while(set.size()<COUNT) { //set.size : ���� ����� ���� 
			set.add((int)(Math.random()*MAX)+1);
		}
		System.out.println(set);
	}
}
