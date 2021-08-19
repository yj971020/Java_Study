package com.libs.collections;

/**
 * 자료구조 구현을 위한 메소드 규격 정의 인터페이스
 */	
// 내가 만든 T 자료형
public interface MyList<E> {

	// 인터페이스 안에는 추상메소드가 옴
	// abstract : 추상

	public abstract void add(E e);

	public abstract E get(int idx);

	public abstract String toString();

	public abstract int size();

	public abstract void remove(int idx);

	public abstract void clear();
}
