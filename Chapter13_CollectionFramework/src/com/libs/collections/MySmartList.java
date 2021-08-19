package com.libs.collections;

public class MySmartList<E> implements MyList<E> {

	// �ʵ弱��

	// ��Ҹ� ������ �迭
	// Object:Ŭ������ ����-> ��� �ڷ��� ��� ���� (��ü�� ����)
	private Object[] elementData;
	// �迭 n ��°�� Ŭ���� �ֱ�

	// �迭 ����� ������ġ
	private int cursor;

	// ���� �迭�� �� ����
	private int capacity;

	// �÷��� �迭�� �뷮 ->����Ұ����� ���
	private final int amount = 3;

	// ������
	MySmartList(int amount) {
		this.capacity = amount;
		elementData = new Object[capacity];
		cursor = 0;
	}

	public MySmartList() {
		this(3);
	}

	// �޼ҵ�
	// ����߰�
	public void add(E e) {
		// ���ǰ˻�(�뷮�� �ʰ��ϴ���)->�뷮 �ʰ��� �迭���� �Ͽ� ������ �ø�
		if (capacity <= cursor) {
			// �迭���� ����
			Object[] tempArr = new Object[capacity + amount];

			for (int i = 0; i < elementData.length; i++) {
				tempArr[i] = elementData[i];
			}
			// ���ٷ� �����ϴ� ��
			// System.arraycopy(elementData, 0, tempArr, 0, capacity); //�ҽ�,������,�����迭,������,������
			// ����

			// ��������
			elementData = tempArr;

			// �迭 �뷮 ������Ʈ
			capacity += amount;
		}
		elementData[cursor++] = e;
	}

	// ��Ҿ��
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

	// ��� ����
	public void remove(int idx) {
		// �����ϰ��� �ϴ� idx�� �������̸� 0���� �ʱ�ȭ
		if (idx != cursor - 1) {
			System.arraycopy(elementData, idx + 1, elementData, idx, cursor - 1 - idx);
		}
		elementData[cursor - 1] = 0;

		// ������ġ �缳��
		cursor--;
	}

	// �迭 �ʱ�ȭ
	public void clear() {
		elementData = new Object[amount];
		capacity = amount;
		cursor = 0;
	}

}
