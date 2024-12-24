package practic;

public class Method_overloding {

	    // Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method to add three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method to add two doubles
	    public double add(double a, double b) {
	        return a + b;
	    }


	
	    public static void main(String[] args) {
	    	Method_overloding calc = new Method_overloding();

	        int sum1 = calc.add(2, 3);
	        int sum2 = calc.add(2, 3, 4);
	        double sum3 = calc.add(2.5, 3.7);

	        System.out.println("Sum 1: " + sum1);
	        System.out.println("Sum 2: " + sum2);
	        System.out.println("Sum 3: " + sum3);
	    }
	}

