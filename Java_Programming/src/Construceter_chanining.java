package practic;

public class Construceter_chanining {

	public void cat(int a, String name) {
		dogname(10);
		System.out.println("first name");
	}
	
	public void dogname(int price) {
		goatname(70.8);
		System.out.println("Second name");
	}
	
	public void goatname(double moneyprice) {
		utility();
		System.out.println("Thrid name");
	}
	
	public void utility() {
		System.out.println("name of all this");
	}
	public static void main(String[] args) {
		Construceter_chanining sc = new Construceter_chanining();
		sc.cat(30, "jabir");
	}
}
