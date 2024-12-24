package programmingClass;

import java.util.Scanner;

public class Factors_numbers {

	//write a program to to get the factors of the given number
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

}
