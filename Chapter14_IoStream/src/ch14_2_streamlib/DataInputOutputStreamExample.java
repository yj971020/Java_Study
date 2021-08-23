package ch14_2_streamlib;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExample {
public static void main(String[] args) throws IOException {
	
	//바이트 기반 출력 스트림을 생성하고 dataOutPutStream 보조 스트림 연결
	FileOutputStream fos=new FileOutputStream("C:/Temp/primitive.db");
	DataOutputStream dos=new DataOutputStream(fos);
	
	//기본타입값 출력
	dos.writeUTF("홍길동");
	dos.writeDouble(95.5);
	dos.writeInt(1);
	
	dos.writeUTF("김자바");
	dos.writeDouble(90.5);
	dos.writeInt(2);

	//출력 스트림 닫기
	dos.flush(); dos.close();
	
	FileInputStream fis=new FileInputStream("C:/Temp/primitive.db");
	DataInputStream dis= new DataInputStream(fis);
	
	for(int i=0;i<2;i++) {
		String name=dis.readUTF()	;
		double score = dis.readDouble();
		int order=dis.readInt();
		System.out.println(name+": "+score+":"+order);
	}
	
	dis.close();//입력스트림 닫기
	
	
	
}
}
