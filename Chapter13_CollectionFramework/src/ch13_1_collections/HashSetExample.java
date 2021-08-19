package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		
		/*
		 * [HashSet] implements Set
		 * List 컬렉션(인터페이스)은 객체의 순서를 유지하지만,
		 * 인덱스로 관리하지는 않음
		 * : 반복자(Iterator) 제공
		 * 중복해서 저장 할 수 없는 수학의 집합 개념
		 * 
		 */
		Set<String>	set=new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java"); // 위에것과 겹침->하나만 저장
		set.add("iBATIS");
		
		//저장된 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체수: "+size);
		
		//반복자를 이용한 루핑
		Iterator<String> iterator=set.iterator(); //해당 자료구조의 반복자 얻기
		while(iterator.hasNext()) { // 객체수 만큼 루핑
			String element=iterator.next(); //1개의 객체를 가져옴
			System.out.println("\t"+element);
		}
		iterator=set.iterator();//초기화 하는 습관!
			//객체 삭제
			set.remove("JDBC"); //1개의 객체 삭제
			set.remove("iBATIS"); //1개의 객체 삭제
			
			//저장된 객체수 얻기
			System.out.println("총 객체수 : "+set.size()); 
			System.out.println("=====================");
			
			//반복자 다시 얻기 (초기화)
			iterator=set.iterator(); // 루핑 돌린 이후엔 무조건 호출하기!(while 문 이후):초기화하는것 : 안하면 결과에 안찍힘
			
			
			while(iterator.hasNext()) { // 객체수 만큼 루핑
				String element=iterator.next(); //1개의 객체를 가져옴
				System.out.println("\t"+element);
			}
			iterator=set.iterator();//초기화 하는 습관!
			System.out.println("총 객체수 : "+set.size()); 
			System.out.println("=====================");
			
			//객체 수 만큼 루핑
			for(String element : set) {
				System.out.println("\t"+element);
			}
			set.clear();
			if(set.isEmpty()) {System.out.println("비어있음");};
			
		}
	}


