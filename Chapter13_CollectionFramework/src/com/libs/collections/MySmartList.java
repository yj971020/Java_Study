package com.libs.collections;

public class MySmartList<E> implements MyList<E> {

	// 필드선언

	// 요소를 저장할 배열
	// Object:클래스의 조상-> 모든 자료형 사용 가능 (객체를 포함)
	private Object[] elementData;
	// 배열 n 번째에 클래스 넣기

	// 배열 요소의 현재위치
	private int cursor;

	// 현재 배열의 총 길이
	private int capacity;

	// 늘려줄 배열의 용량 ->변경불가능한 상수
	private final int amount = 3;

	// 생성자
	MySmartList(int amount) {
		this.capacity = amount;
		elementData = new Object[capacity];
		cursor = 0;
	}

	public MySmartList() {
		this(3);
	}

	// 메소드
	// 요소추가
	public void add(E e) {
		// 조건검사(용량을 초과하는지)->용량 초과시 배열복사 하여 사이즈 늘림
		if (capacity <= cursor) {
			// 배열복사 수행
			Object[] tempArr = new Object[capacity + amount];

			for (int i = 0; i < elementData.length; i++) {
				tempArr[i] = elementData[i];
			}
			// 한줄로 복사하는 법
			// System.arraycopy(elementData, 0, tempArr, 0, capacity); //소스,시작점,목적배열,시작점,복사할
			// 갯수

			// 참조변경
			elementData = tempArr;

			// 배열 용량 업데이트
			capacity += amount;
		}
		elementData[cursor++] = e;
	}

	// 요소얻기
	public E get(int idx) {
		return (E) elementData[idx];
	}

	public int size() {
		return cursor;
	}

	public String toString() {
		String tmp = "";
		for (Object e : elementData) {
			tmp += e + ",";
		}
		return "[" + tmp + "]";
	}

	// 요소 삭제
	public void remove(int idx) {
		// 삭제하고자 하는 idx가 마지막이면 0으로 초기화
		if (idx != cursor - 1) {
			System.arraycopy(elementData, idx + 1, elementData, idx, cursor - 1 - idx);
		}
		elementData[cursor - 1] = 0;

		// 현재위치 재설정
		cursor--;
	}

	// 배열 초기화
	public void clear() {
		elementData = new Object[amount];
		capacity = amount;
		cursor = 0;
	}

}
