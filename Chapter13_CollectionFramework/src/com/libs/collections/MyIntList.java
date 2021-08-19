package com.libs.collections;

/*
 * int[] 를 관리하기위한 자료구조
 */


//단점: int 형만 사용가능 . 자료형마다 만들긴 귀찮음
public class MyIntList {

	// 필드

	// 요소를 저장할 배열
	int[] arr;

	// 배열 요소의 현재위치
	private int cursor;

	// 현재 배열의 총 길이
	private int capacity;

	// 늘려줄 배열의 용량 ->변경불가능한 상수
	private final int amount;

	// 생성자
	public MyIntList(int amount) {
		this.amount = amount;
		this.capacity = this.amount;
		this.arr = new int[amount];
		cursor = 0;
	}

	// 메소드
	// 요소추가
	public void add(int num) {
		// 조건검사(용량을 초과하는지)->용량 초과시 배열복사 하여 사이즈 늘림
		if (capacity <= cursor) {
			// 배열복사 수행
			int[] tempArr = new int[capacity + amount];
			
			for (int i = 0; i < arr.length; i++) {
				tempArr[i] = arr[i];
			}
			// 한줄로 복사하는 법
			// System.arraycopy(arr, 0, tempArr, 0, capacity); //소스,시작점,목적배열,시작점,복사할 갯수

			// 참조변경
			arr = tempArr;

			// 배열 용량 업데이트
			capacity += amount;
		}
		arr[cursor++] = num;
	}

	// 요소얻기
	public int get(int idx) {
		return arr[idx];
	}

	public int size() {
		return cursor;
	}

	public String toString() {
		String tmp = "";
		for (int i : arr) {
			tmp += i + ",";
		}
		return "[" + tmp + "]";
	}

	// 요소 삭제
	public void remove(int idx) {
		//삭제하고자 하는 idx가 마지막이면 0으로 초기화
		if(idx!=cursor-1) {
			System.arraycopy(arr,  idx+1, arr, idx, cursor-1-idx);
		}
		arr[cursor-1]=0;
		
		//현재위치 재설정
		cursor--;
	}

	//배열 초기화
	public void clear() {
		arr=new int[amount];
		capacity=amount;
		cursor=0;
	}
}
