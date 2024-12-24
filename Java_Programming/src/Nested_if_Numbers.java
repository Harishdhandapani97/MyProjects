package conditional_statements_realtime_programs;

public class Nested_if_Numbers {

	public static void main(String[] args) {

		int a= 9;
		int b=5;
		int c= 10;
		

		if(a < b) {
			System.out.println("a is greater than b "+b);
			System.out.println("a is the Largest value "+a);
			
			
			if(a > c) {
				System.out.println("a is greater than c "+a);
				System.out.println("c is Largest value "+c);
			}
			else {
				System.out.println("a is not greater of it");
			}
			
		}
		else {
			System.out.println("You have not given it");
			
			if(b>c) {
			    System.out.println("b is greater than c"+c);
			    System.out.println("c is the greatest number");
			}
			else {
				System.out.println("b is not greater than the c");
			}
		}
		
	}
}


	

				


