package ch14_2_streamlib;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExample {
public static void main(String[] args) throws IOException {
	
	//����Ʈ ��� ��� ��Ʈ���� �����ϰ� dataOutPutStream ���� ��Ʈ�� ����
	FileOutputStream fos=new FileOutputStream("C:/Temp/primitive.db");
	DataOutputStream dos=new DataOutputStream(fos);
	
	//�⺻Ÿ�԰� ���
	dos.writeUTF("ȫ�浿");
	dos.writeDouble(95.5);
	dos.writeInt(1);
	
	dos.writeUTF("���ڹ�");
	dos.writeDouble(90.5);
	dos.writeInt(2);

	//��� ��Ʈ�� �ݱ�
	dos.flush(); dos.close();
	
	FileInputStream fis=new FileInputStream("C:/Temp/primitive.db");
	DataInputStream dis= new DataInputStream(fis);
	
	for(int i=0;i<2;i++) {
		String name=dis.readUTF()	;
		double score = dis.readDouble();
		int order=dis.readInt();
		System.out.println(name+": "+score+":"+order);
	}
	
	dis.close();//�Է½�Ʈ�� �ݱ�
	
	
	
}
}
