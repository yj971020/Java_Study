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
		
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()))	;
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()))	;
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()))	;
		list.add(new Board(4, "제목4", "내용4", "글쓴이4", new Date()))	;
		list.add(new Board(5, "제목5", "내용5", "글쓴이5", new Date()))	;
		
		//Board클래스 직렬화
		
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
