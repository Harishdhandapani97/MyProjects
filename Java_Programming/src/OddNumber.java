package programmingClass;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
	//print odd number using scanner class
		
		Scanner s = new Scanner(System.in);
		System.out.println("eneter the number");
		int a= s.nextInt();
		if(a%2==1){
		System.out.println("it is  an odd number");
		}
		else{
		System.out.println("it is not an odd number");
		}
	}
}


