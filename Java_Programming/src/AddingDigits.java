package programmingClass;

import java.util.Scanner;

public class AddingDigits {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		
		while(num!=0) {
			sum+=num%10;
			num/=10;
			}
		System.out.println(sum);
		
	}

}
