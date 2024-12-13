package multiThreading09_12_2024;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println(Thread.currentThread().getName()+ " "+ i);
		}
	}
}
public class ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();

		t2.start();
	}

}
