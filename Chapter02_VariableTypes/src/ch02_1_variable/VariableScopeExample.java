package ch02_1_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1=15;
		if(v1>10) {
			
			//System.out.println(v1>10); ���:true
			int v2; //if�� �ȿ����� ��밡���� ����
			v2=v1-10;
			
		}
		//int v3=v1+v2+5; //v2 ������ ����� �� ���� ������ ����
		
	}

}
