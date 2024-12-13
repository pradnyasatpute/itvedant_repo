package oops;
interface SendMessage{
	int counter=10;
	void messageSend();
}
class Instagram implements SendMessage{
	@Override
	public void messageSend() {
		System.out.println("Instagram message");
		
	}
	
}
class Whatsapp implements SendMessage{
	@Override
	public void messageSend() {
		System.out.println("Whatsapp Message");
		
	}
}
public class InterfaceConcepts {

	public static void main(String[] args) {
		
		SendMessage s1=new Instagram();
		s1.messageSend();
		System.out.println(s1.counter);
		SendMessage s2 = new Whatsapp();
		s2.messageSend();
		System.out.println(s2.counter);

	}

}
