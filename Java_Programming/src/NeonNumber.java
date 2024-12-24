package programmingClass;

import java.util.Scanner;

public class NeonNumber {
	
	//write a program to identify  whether the given number is NEON number
	//product=9*9=81  sum=8+1=9 so it is NEON number
	
	public static boolean isNeon(int num) {
		int square=num*num;
		int sum=0;
		while(square>0) {
			sum+=square%10;
			square/=10;
		}
		return (sum==num);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(isNeon(num)) {
			System.out.println("It is a Neon number");
		}
		else {
			System.out.println("It is not a Neon number");
		}
		
	}

}
