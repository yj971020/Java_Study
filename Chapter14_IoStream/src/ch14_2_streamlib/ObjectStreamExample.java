package ch14_2_streamlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		writeList();
		List<Board>	list=readList();
		

	}

	private static void writeList() throws Exception{
		List<Board> list=new ArrayList<>();
		
		list.add(new Board(1, "����1", "����1", "�۾���1", new Date()))	;
		list.add(new Board(2, "����2", "����2", "�۾���2", new Date()))	;
		list.add(new Board(3, "����3", "����3", "�۾���3", new Date()))	;
		list.add(new Board(4, "����4", "����4", "�۾���4", new Date()))	;
		list.add(new Board(5, "����5", "����5", "�۾���5", new Date()))	;
		
		//BoardŬ���� ����ȭ
		
		FileOutputStream fos= new FileOutputStream("C:/Temp/borad.db");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}

	public static List<Board> readList() throws Exception{
		FileInputStream fis =new FileInputStream("C:/Temp/borad.db");
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<Board> list=(List<Board>)ois.readObject();
		return list;
							
	}
}
