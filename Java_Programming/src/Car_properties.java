package practic;

public class Car_properties {

	String name;
	String barnd;
	int price;
	String colour;
	public Car_properties(String name,String brand) {
		
		this.name=name;
		this.barnd=brand;
	}
	
	public Car_properties(int price,String colour) {
		
		this.price=price;
		this.colour=colour;
	}
	
	public void displayinfo() {
		
		System.out.println("The name of the car is : "+name);
		System.out.println("The Brand of the Car is  : "+barnd);
	}
	public void diaplayinfog() {
		System.out.println("The Price of the car  is : "+price);
		System.out.println("The colour of the car is : "+colour);
	}
	public static void main(String[] args) {
		Car_properties ch = new Car_properties("BMW", "Burhan jabir");
		Car_properties cm = new Car_properties(3000, "Blue");
		ch.displayinfo();
		System.out.println("**********************");
		cm.diaplayinfog();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
