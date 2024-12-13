package multiThreading09_12_2024;

class Message{
	public void sendMessage(String message) {
		System.out.println("Hello "+message);
		System.out.println("message received by "+message+ ".....");
	}
}
class SendUsingThread extends Thread{
	Message m;
	String message;
	public SendUsingThread(Message m , String message) {
		this.m=m;
		this.message=message;
		
	}
	@Override
	public void run() {
		synchronized (message) {
			m.sendMessage(message);
		}
		
	}
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		
		Message m = new Message();
		
		SendUsingThread s1 = new SendUsingThread(m, "Pradnya");
		
		SendUsingThread s2 = new SendUsingThread(m,"Rani");
		
		s1.start();
		s2.start();
		

	}

}
