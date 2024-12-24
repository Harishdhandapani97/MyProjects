package practic;

public class Non_Paramatriez_Consatructer {

	//The car properties
	String model;
	String name;
	int price;
	String Colour;
	
	
	
	
	public Non_Paramatriez_Consatructer() {
		
		int a=40;
		int b=120;
		System.out.println("This is the Non-paramateized Constructer");
		
	}
	
	public Non_Paramatriez_Consatructer(String model,String name,int price,String Colour) {
		this.model=model;
		this.name=name;
		this.price=price;
		this.Colour=Colour;
		return;
	}
	
	public void displayinfo() {
		
		System.out.println("The Model name is : "+model);
		System.out.println("The Name of the Car is : "+name);
		System.out.println("The price of the Car is : "+price);
		System.out.println("The Colour of the Car is : "+Colour);
	}
	
	public static void main(String[] args) {

		Non_Paramatriez_Consatructer mn = new Non_Paramatriez_Consatructer("BMW", "Burhan Jabir", 30000, "Black");
		mn.displayinfo();
		
	}

}
