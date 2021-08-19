package ch13_1_collections;

import com.libs.collections.MyList;
import com.libs.collections.MySmartList;

public class MyCollectionTest3 {

	public static void main(String[] args) {

		MyList<String> list = new MySmartList<String>();
		list.add("1");
		list.add("e");
		list.add("5");
		list.add("��");

		list.add("ȫ�浿");

		System.out.println(list);
		System.out.println("list[2]�� �� : " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("----------------------");

		// ���� �ذ� �ϱ�
		// [1,3,5,]->[1,5,]
		list.remove(1);
		System.out.println(list);
		System.out.println("list[2]�� �� : " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("----------------------");

		// |0|0|0|
		list.clear();
		System.out.println(list);
		System.out.println("list[2]�� �� : " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("----------------------");

		// ������ �迭 �����
		MyList<Integer> list1 = new MySmartList<Integer>();

		list1.add(new Integer(100)); // Auto Boxing
		list1.add(30);
		System.out.println(list1);
		System.out.println("list[2]�� �� : " + list1.get(2));
		System.out.println("size: " + list1.size());
		System.out.println("----------------------");
		
		//���� �ڷ��� �ֱ�
		//�̷��� �� �Ⱦ�
		
		MyList<Object> list2 = new MySmartList<Object>();

		list2.add(new Integer(100)); // Auto Boxing
		list2.add(30);
		list2.add("��");
		list2.add(3.14f);
		System.out.println(list2);
		System.out.println("list[2]�� �� : " + list2.get(2));
		System.out.println("size: " + list2.size());
		System.out.println("----------------------");

	}

}
