package ch13_1_collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
class MyClass{}
public class CollectionExample {

		public static void main(String[] args) {
			//값을 저장하는 배열
			
			int[] arr1=new int[3];
			arr1[0]=1;
			System.out.println(arr1[0]);
			System.out.println(Arrays.toString(arr1));
			
			//번지를 저장하는 배열
			MyClass[] arr2=new MyClass[3];
			arr2[0]=new MyClass();
			System.out.println(Arrays.toString(arr2));
			//배열의 한계
			
			//collection 자료구조 등장
			
			List<String> list1=new ArrayList<>();
			list1.add("kor");
			list1.add("1");
			System.out.println(list1);
			
			List<Integer> list2=new ArrayList<>(); //int 말고 Integer 써야함 ( 클래스를 넣어아햐기때문)
			list2.add(new Integer(1));
			list2.add(1); //오토박싱
			
			List<Character> list3=new Vector<>();
			list3.add('e'); list3.add('f');
			System.out.println(list3);
			
			List<Float> list4 = new LinkedList<>();
			list4.add(0.1f); list4.add(1.1f);//float 형 : 숫자 마지막에 f

			List<Double> list5=new LinkedList<>();
			list5.add(0.1);
			list5.add(0.1);
			list5.add(0.1);
			System.out.println(list5);
			
			Set<Double> set=new HashSet<>();
			set.add(0.1);
			set.add(0.1);
			
			
		
			
		}
}
