package programmingClass;

import java.util.Scanner;

public class LargestInDigit {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int largest=-1;
		while(num>0) {
			int digit=num%10;
			if(digit>largest) {
				largest=digit;
			}
			num/=10;
		}
		System.out.println(largest);
		
	}

}
