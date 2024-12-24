package practic;

public class Constructer {
 
	//Car properties
	int price;
	String name;
	String brand;
	String colour;
	
	public Constructer(int price,String name) {
		this.price=price;
		this.name=name;
		return;
	}
	
	public Constructer(String brand, String colour) {
		this.brand=brand;
		this.colour=colour;
		return;
	}
	
	void displayinfo() {
		 System.out.println("the given price is :"+price);
		 System.out.println("the Given name : "+name);
		 System.out.println("The given barnd : "+brand);
		 System.out.println("the Given Colour :"+colour);
	}
	
	
	public static void main(String[] args) {
		Constructer sn = new Constructer(1000, "toyota");
		Constructer sn1= new Constructer("jakka", "Black");
		sn.displayinfo();
		sn1.displayinfo();
		
	}


	
}
