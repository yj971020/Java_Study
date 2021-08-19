package ch13_1_collections;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("java");
		list.add("JDC");
		list.add("Servlet/JSP");
		System.out.println(list);
		
		list.add(2,"Database");
		System.out.println(list);
		
		list.add("IBATIS");
		
		int size=list.size();
		System.out.println(list);
		System.out.println("ÃÑ °´Ã¼¼ö : "+size);
		System.out.println("-------------");
		
		String skill=list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i=0; i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+": "+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove("IBATIS");
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
		System.out.println(i+": "+str);
	}
	}

}
