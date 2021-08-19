package com.libs.collections;

/**
 * �ڷᱸ�� ������ ���� �޼ҵ� �԰� ���� �������̽�
 */	
// ���� ���� T �ڷ���
public interface MyList<E> {

	// �������̽� �ȿ��� �߻�޼ҵ尡 ��
	// abstract : �߻�

	public abstract void add(E e);

	public abstract E get(int idx);

	public abstract String toString();

	public abstract int size();

	public abstract void remove(int idx);

	public abstract void clear();
}
