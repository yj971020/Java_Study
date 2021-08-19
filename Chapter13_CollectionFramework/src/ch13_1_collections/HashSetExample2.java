package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {

		Set<Member>	set=new HashSet<Member>();
		
		set.add(new Member("홍길동", 30)); 
		set.add(new Member("홍길동", 30));//인스턴스는 다르지만 내부데이터 동일 -> 객체는 1개만 저장
		set.add(new Member("김예진", 25)); 
		set.add(new Member("홍길동", 25)); 
		
		System.out.println("총 객체수 : "+set.size());
		System.out.println(set);
		
		Iterator<Member> itr=set.iterator();
		
		while(itr.hasNext()) {
			Member m=itr.next()	;
			System.out.println(m.name+", "+m.age);
		}
		itr=set.iterator();
	
	}

}
