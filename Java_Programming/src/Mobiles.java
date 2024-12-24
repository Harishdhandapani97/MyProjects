package practic;

public class Mobiles {

	int price;
	String colour;
	double discount;
	public Mobiles() {
		this(3000, "blue");
		System.out.println("The New Mobile has Launched");
	}

	public Mobiles(int price,String colour) {
		this(50.9);
		this.price=price;
		this.colour=colour;
		System.out.println("This is the Price of the Mobile : "+price+"this is the colour : "+colour);

	}

	public Mobiles(double discount) {
		this.discount=discount;
		System.out.println("the Discount price of the is : "+discount);
	}

	public static void main(String[] args) {
		Mobiles mn= new Mobiles();
		


	}

}
