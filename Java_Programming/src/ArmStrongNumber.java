package programmingClass;

import java.util.Scanner;

public class ArmStrongNumber {
	//write a program to find it is ArmStorng number
	//153 - has three digit so every digit should be multiplied three times
	// (1*1*1)+(5*5*5)+(3*3*3) =153 so 153==153 so ArmStrong number
	
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
		return sum == originalNum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		
		if(isArmStrong(num)) {
			System.out.println("It is an ArmStrong number");
		}
		else {
			System.out.println("It is not an ArmStrong number");
		}
	}

}
