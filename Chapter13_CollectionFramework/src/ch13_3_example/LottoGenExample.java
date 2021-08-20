package ch13_3_example;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LottoGenExample {

	static final int MAX=45;
		static final int COUNT=6;	
		
	public static void main(String[] args) {
	/*
	 * 로또번호 생성기
	 * 
	 * 중복저장 되지 않는 HASHSET이용
	 */	
	
		//무작위 번호 생성
		Set<Integer> set=new HashSet<>(COUNT);//6개 숫자 저장하기 위한 공간
		while(set.size()<COUNT) { //set.size : 현재 저장된 갯수 
			set.add((int)(Math.random()*MAX)+1);
		}
		
		List<Integer>	lotto= new LinkedList<>(set);
		Collections.sort(lotto);
		System.out.println(set);
	}
}
