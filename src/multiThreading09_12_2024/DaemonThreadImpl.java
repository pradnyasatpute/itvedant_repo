package multiThreading09_12_2024;

class MainThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Main Started");
		System.out.println(Thread.currentThread().getName()+" Main Stopped");
		
	}
}
class DaemonThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Daemon Started");
		System.out.println(Thread.currentThread().getName()+" Daemon Stopped");
		
	}
}
public class DaemonThreadImpl {

	public static void main(String[] args) {
		
		Thread mainThread = new Thread(new MainThread());
		Thread daemonThread = new Thread(new DaemonThread());
		
		daemonThread.setDaemon(true);
		
		mainThread.start();
		daemonThread.start();

	}

}
