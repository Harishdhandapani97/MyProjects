package programmingClass;

import java.util.Scanner;

public class PerfectNnumber_range {

	// write a program to print perfect number in between the range
	 public static boolean isPerfect(int num) {
		
		 int sum=0;
		 for(int i =1;i<num;i++) {
			 if(num%i==0) {
					sum+=i;
				}
			 }
		 return (sum==num);
	}
	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the start number");
		int start = s.nextInt();
		System.out.println("enter the end number");
		int end = s.nextInt();
		 for(int a=start;a<end;a++) {
			 if(isPerfect(a)) {
				 System.out.println(a+" is a perfect number");
			 }
			
		 }
		
	}
	
}
