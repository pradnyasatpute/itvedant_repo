package multiThreading09_12_2024;


class Table{
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n + " X " +i + " = "+(n*i));
		}
	}
}
class Thread1 extends Thread{
	Table t;
	public Thread1(Table t){
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(2);
	}
}
class Thread2 extends Thread{
	Table t;
	public Thread2(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(3);
	}
}
public class SynchronizedMethod {

	public static void main(String[] args) {
		Table t=new Table();
		
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		
		t1.start();
		t2.start();

	}

}
