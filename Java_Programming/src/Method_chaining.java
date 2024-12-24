package practic;

public class Method_chaining {

	public static void bankbalance() {
		checkbalance();
		int a=10;
		int b=40;
		int c=a+b;
		System.out.println("your bank balance is : "+c);
	}

	public static void checkbalance() {
		withdraw();
		int a=40;
		int e=80;
		int f=a-e;
		System.out.println("your bank balance is : "+f);
	}

	public static void withdraw() {
		
		int a=60;
		int f=120;
		int g=a/f;
		System.out.println("You have Withdraw the amount of : "+g);
	}

	public static void main(String[] args) {
		Method_chaining.bankbalance();

	}

}
