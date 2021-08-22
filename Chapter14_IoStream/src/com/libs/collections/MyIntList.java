package com.libs.collections;

/*
 * int[] �� �����ϱ����� �ڷᱸ��
 */


//����: int ���� ��밡�� . �ڷ������� ����� ������
public class MyIntList {

	// �ʵ�

	// ��Ҹ� ������ �迭
	int[] arr;

	// �迭 ����� ������ġ
	private int cursor;

	// ���� �迭�� �� ����
	private int capacity;

	// �÷��� �迭�� �뷮 ->����Ұ����� ���
	private final int amount;

	// ������
	public MyIntList(int amount) {
		this.amount = amount;
		this.capacity = this.amount;
		this.arr = new int[amount];
		cursor = 0;
	}

	// �޼ҵ�
	// ����߰�
	public void add(int num) {
		// ���ǰ˻�(�뷮�� �ʰ��ϴ���)->�뷮 �ʰ��� �迭���� �Ͽ� ������ �ø�
		if (capacity <= cursor) {
			// �迭���� ����
			int[] tempArr = new int[capacity + amount];
			
			for (int i = 0; i < arr.length; i++) {
				tempArr[i] = arr[i];
			}
			// ���ٷ� �����ϴ� ��
			// System.arraycopy(arr, 0, tempArr, 0, capacity); //�ҽ�,������,�����迭,������,������ ����

			// ��������
			arr = tempArr;

			// �迭 �뷮 ������Ʈ
			capacity += amount;
		}
		arr[cursor++] = num;
	}

	// ��Ҿ��
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

	// ��� ����
	public void remove(int idx) {
		//�����ϰ��� �ϴ� idx�� �������̸� 0���� �ʱ�ȭ
		if(idx!=cursor-1) {
			System.arraycopy(arr,  idx+1, arr, idx, cursor-1-idx);
		}
		arr[cursor-1]=0;
		
		//������ġ �缳��
		cursor--;
	}

	//�迭 �ʱ�ȭ
	public void clear() {
		arr=new int[amount];
		capacity=amount;
		cursor=0;
	}
}
