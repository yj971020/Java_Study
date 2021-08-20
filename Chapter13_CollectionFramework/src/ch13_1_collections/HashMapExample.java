package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
			
		/*
		 * HashMap: implements Map
		 * 
		 * Ű(key) ��ü, �� (value) ��ü�� ������ Map.Entry ��ü�� �����ϴ� ����
		 * :Entry �� Map �������̽� ���ο� ����� ��ø �������̽�
		 * key �� �ߺ����� �� �� ������ ���� �ߺ� ���� ����
		 * 
		 */
		
		//�̸��� ������ �����ϴ� �ڷᱸ��
		Map<String,Integer> map=new HashMap<>();
		
		//��ü ����
		map.put("�ſ��", new Integer(85));
		map.put("ȫ�浿", 90);//����ڽ�
		map.put("����", 80);
		
		map.put("ȫ�浿 ",95);	// :"ȫ�浿" Ű�� ���⶧���� ���� �������� ������ ������ ��ü
		System.out.println("�� Entry �� :"+map.size());
		
		//[��ü ã��] 
		System.out.println("\t ȫ�浿: "+map.get("ȫ�浿")); //�̸�(Ű)�� ������ ��ü
		//[Ű �˻�]
		System.out.println("Key ���� ����: "+map.containsKey("����"));
		System.out.println("==================");
		
		//[��ü ���� �� ó��]
		
		//1.Set<key> �̿�
	
		Set<String>	keySet=map.keySet();	//key Set ���
		Iterator<String> keyIterator=keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next()	;
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		keyIterator = keySet.iterator();
		
		System.out.println("==================");
		
		//2. set<Map,Entry> �̿�
		Set<Map.Entry<String, Integer>>	entrySet=map.entrySet();	//key Set ���
		Iterator<Map.Entry<String, Integer>> eitr=entrySet.iterator();
		
		while(eitr.hasNext()) {
			Map.Entry<String, Integer> entry=eitr.next();
			String key=entry.getKey()	;
			Integer iv = map.get(key);
			System.out.println("\t"+key+":"+iv);
		}
		eitr = entrySet.iterator();
		
		System.out.println("==================");
		
		
		//��ü����
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " +map.size());
		
		//��ü ����
		map.clear();
	}

}
