package oops;
class Vehicle{
	int no_of_tyres;
	String color;
	String vehicle_type;
}
class Accesories extends Vehicle{
	String music_company;
	
}
class Car extends Accesories{
	String car_name;
	
	void display() {
		System.out.println("Car name is "+car_name);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Car c = new Car();
		c.car_name="Dzire";
		c.no_of_tyres=4;
		c.color="White";
		c.vehicle_type="Petrol";
		c.music_company="Sony";
		
		System.out.println("car name "+c.car_name);
		System.out.println("No.of tyres are : "+c.no_of_tyres);
		System.out.println("Color is "+c.color);
		System.out.println("vehicle type :"+c.vehicle_type);
		System.out.println("Music Company "+c.music_company);

	}

}
