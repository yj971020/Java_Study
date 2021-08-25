package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {

		/*
		 * [Hashtable] implements Map
		 * 
		 * HashmMap �� ������ ���� ���� - ����ȭ(synchronized )�� �޼ҵ�� ���� : �ϳ��� �����尡 ���� �Ϸ��ؾ߸� �ٸ� ������
		 * ���� ����
		 */

		// ���̵� ,��� �˻�

		Map<String, String> map = new Hashtable<String, String>();
		map.put("Spring", "12");
		map.put("summer", "123");
		map.put("fall","1234");
		map.put("winter", "12345");
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.println("���̵�: ");
			String id=scan.nextLine().trim();
			System.out.println("��й�ȣ: ");
			String pw=scan.nextLine().trim();
			System.out.println();
			
			//ID�� ���ٸ�
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ID �� �������� �ʴ� ���̵��Դϴ� .�ٽ� �Է����ּ���");
			}
			//ID�� �ִٸ�
			else {
				//��� ����ġ
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ� .");
					
				}
			}
			scan.close();
		}
		
	}

}
