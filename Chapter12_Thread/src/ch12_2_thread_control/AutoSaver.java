package ch12_2_thread_control;

public class AutoSaver extends Thread{
	private int[] arr;
	private int count;
	
	public AutoSaver(int length) {
		
		arr=new int[length];
		count=0;
	}
	
	public void run() {
		int i=0; 
		while(true) {
			try {Thread.sleep(300);}catch(Exception e) {}
			if(count<arr.length-1) {
			save(i++);
		}
	}

}
	private void save(int num) {
		arr[count++]=num;
		System.out.println(num+" 을 저장 합니다");
	}
}
