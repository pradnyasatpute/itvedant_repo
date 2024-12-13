package moviebookapp;

class BookTheaterSeat{
	int total_seats=10;
	synchronized void bookSeat(int seats) {
		if(total_seats>=seats) {
			System.out.println(seats+"     seats booked successfully");
			total_seats = total_seats-seats;
			System.out.println("Seats left : "+total_seats);
		}
		else {
			System.out.println("Sorry seats cannot be booked..!!");
			System.out.println("Seats left : "+total_seats);
		}
	}
}
public class MovieBookApp extends Thread{
	static BookTheaterSeat b;
	int seats;
	@Override
	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=new BookTheaterSeat();
		
		MovieBookApp pradnya = new MovieBookApp();
		pradnya.seats=7;
		pradnya.start();
		
		MovieBookApp rani = new MovieBookApp();
		rani.seats=5;
		rani.start();
		
		

	}

}
