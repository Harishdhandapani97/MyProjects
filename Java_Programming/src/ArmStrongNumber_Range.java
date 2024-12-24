package programmingClass;

import java.util.Scanner;

public class ArmStrongNumber_Range {
	// write a program to get ArmStrong numbers within the range
	
	public static boolean isArmStrong(int num) {
		int originalNum=num;
		int sum=0;
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		num=originalNum;
		
		while(num>0) {
			int product=1;
			int digit=num%10;
		for(int i= 1;i<=count;i++) {
			product*=digit;
		}
			sum+=product;
			num/=10;
		}
		return sum==originalNum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the start  number");
		int start = s.nextInt();
		System.out.println("Enter the end number");
		int end = s.nextInt();
		System.out.println("The ArmStrong numbers are");
		for(int num=start;num<=end;num++) {
			if(isArmStrong(num)) {
				System.out.println(num);
			}
			
		}
	}

}
