package programmingClass;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(num%10==7 || num%7==0) {
			System.out.println("it is a buzz number");
		}
		else {
			System.out.println("not a buzz number");
		}
	}

}
