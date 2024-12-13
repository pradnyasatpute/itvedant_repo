package multiThreading09_12_2024;

class MyThreadClass implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println(Thread.currentThread().getName() + " "+ i);
		}
		
	}
}
public class RunnableInterfaceImpl {

	public static void main(String[] args) {
		
		MyThreadClass m1 = new MyThreadClass();
		
		Thread t1 = new Thread(m1,"T1");
		Thread t2 = new Thread(m1,"T2");
		
		t1.start();
		t2.start();
	}

}
