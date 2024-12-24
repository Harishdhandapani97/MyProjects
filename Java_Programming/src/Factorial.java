package programmingClass;

import java.util.Scanner;

public class Factorial {
	//write  a program to find the factorial of given number
	
	public static int factorial(int num) {
		int fact =1;
			for(int i=num;i>=1;i--) {
			fact*=i;
			System.out.println(i);
		}
			return fact;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		
		int fact=factorial(num);{
		System.out.println("The factorial number is "+fact);
	 }
	}
}
