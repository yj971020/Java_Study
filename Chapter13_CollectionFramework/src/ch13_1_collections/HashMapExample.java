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
		 * 키(key) 객체, 값 (value) 객체로 구성된 Map.Entry 객체를 저장하는 구조
		 * :Entry 는 Map 인터페이스 내부에 선언된 중첩 인터페이스
		 * key 는 중복저장 될 수 없지만 값은 중복 저장 가능
		 * 
		 */
		
		//이름과 점수를 저장하는 자료구조
		Map<String,Integer> map=new HashMap<>();
		
		//객체 저장
		map.put("신용권", new Integer(85));
		map.put("홍길동", 90);//오토박싱
		map.put("장길산", 80);
		
		map.put("홍길동 ",95);	// :"홍길동" 키가 같기때문에 제일 마지막에 저장한 값으로 대체
		System.out.println("총 Entry 수 :"+map.size());
		
		//[객체 찾기] 
		System.out.println("\t 홍길동: "+map.get("홍길동")); //이름(키)로 점수를 대체
		//[키 검색]
		System.out.println("Key 존재 여부: "+map.containsKey("장길산"));
		System.out.println("==================");
		
		//[객체 루핑 및 처리]
		
		//1.Set<key> 이용
	
		Set<String>	keySet=map.keySet();	//key Set 얻기
		Iterator<String> keyIterator=keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next()	;
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		keyIterator = keySet.iterator();
		
		System.out.println("==================");
		
		//2. set<Map,Entry> 이용
		Set<Map.Entry<String, Integer>>	entrySet=map.entrySet();	//key Set 얻기
		Iterator<Map.Entry<String, Integer>> eitr=entrySet.iterator();
		
		while(eitr.hasNext()) {
			Map.Entry<String, Integer> entry=eitr.next();
			String key=entry.getKey()	;
			Integer iv = map.get(key);
			System.out.println("\t"+key+":"+iv);
		}
		eitr = entrySet.iterator();
		
		System.out.println("==================");
		
		
		//객체삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " +map.size());
		
		//전체 삭제
		map.clear();
	}

}
