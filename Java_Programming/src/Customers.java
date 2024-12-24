package practic;


public class Customers implements Buses{

	int bustype=30;
	String myfavouritebus="volvo";
	@Override
	public void goingtobus() {
		System.out.println("we are goinfg to it");
		
	}
	@Override
	public void buyingtheseat() {
		System.out.println("this is the Bus we want to it");		
	}
	
	public static void main(String[] args) {
		
		Buses bm = new Customers();
		bm.goingtobus();
		bm.buyingtheseat();
	}
	
	
	
	
}
