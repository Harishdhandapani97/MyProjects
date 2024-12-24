package programmingClass;

import java.util.Scanner;

public class Count_digits {

	//write a program to get the count of digits given
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num =s.nextInt();
		int digit=0;
		
	 if(num==0) {
		digit=1;
			
		 }
	 else {
		 while(num!=0)
			{
			num/=10;
			digit++;
	
			}
		System.out.println(digit);
	 	}
	
	}
}
