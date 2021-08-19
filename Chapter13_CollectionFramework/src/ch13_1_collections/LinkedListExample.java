package ch13_1_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		/*
		 * [LinkedList] 가 ArrayList 보다 얼마나 빠른지
		 * ArrayList 는 내부 배열에 객체를 저장해서 관리
		 * LinkedList는 인접 참조를 링크해서 체인처럼 관리
		 * 특정 인덱스에 객체를 삽입. 삭제 시 앞 뒤 링크만 변경, 나머지 링크는 불변
		 * 
		 * 끝에서 부터 순차적 추가 .삭제 하는 경우 ArrayList 빠름
		 * 중간에 추가. 삭제하는 경우 LinkedList 빠름
		 */
		
		List<String> list1=new ArrayList<String>();
		List<String> list2=new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린시간: "+(endTime-startTime)+"ns");

		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList 걸린시간: "+(endTime-startTime)+"ns");

		
	}

}
