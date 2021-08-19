package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		
		/*
		 * [HashSet] implements Set
		 * List �÷���(�������̽�)�� ��ü�� ������ ����������,
		 * �ε����� ���������� ����
		 * : �ݺ���(Iterator) ����
		 * �ߺ��ؼ� ���� �� �� ���� ������ ���� ����
		 * 
		 */
		Set<String>	set=new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java"); // �����Ͱ� ��ħ->�ϳ��� ����
		set.add("iBATIS");
		
		//����� ��ü �� ���
		int size = set.size();
		System.out.println("�� ��ü��: "+size);
		
		//�ݺ��ڸ� �̿��� ����
		Iterator<String> iterator=set.iterator(); //�ش� �ڷᱸ���� �ݺ��� ���
		while(iterator.hasNext()) { // ��ü�� ��ŭ ����
			String element=iterator.next(); //1���� ��ü�� ������
			System.out.println("\t"+element);
		}
		iterator=set.iterator();//�ʱ�ȭ �ϴ� ����!
			//��ü ����
			set.remove("JDBC"); //1���� ��ü ����
			set.remove("iBATIS"); //1���� ��ü ����
			
			//����� ��ü�� ���
			System.out.println("�� ��ü�� : "+set.size()); 
			System.out.println("=====================");
			
			//�ݺ��� �ٽ� ��� (�ʱ�ȭ)
			iterator=set.iterator(); // ���� ���� ���Ŀ� ������ ȣ���ϱ�!(while �� ����):�ʱ�ȭ�ϴ°� : ���ϸ� ����� ������
			
			
			while(iterator.hasNext()) { // ��ü�� ��ŭ ����
				String element=iterator.next(); //1���� ��ü�� ������
				System.out.println("\t"+element);
			}
			iterator=set.iterator();//�ʱ�ȭ �ϴ� ����!
			System.out.println("�� ��ü�� : "+set.size()); 
			System.out.println("=====================");
			
			//��ü �� ��ŭ ����
			for(String element : set) {
				System.out.println("\t"+element);
			}
			set.clear();
			if(set.isEmpty()) {System.out.println("�������");};
			
		}
	}


