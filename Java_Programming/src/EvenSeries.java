package programmingClass;

import java.util.Scanner;

public class EvenSeries {

	public static void main(String[] args) {
	//print the even numbers in the given range 1-10
		
		Scanner s = new Scanner(System.in);
		System.out.println("eneter the starting number");
		int a=s.nextInt();
		System.out.println("eneter the  ending number");
		int b= s.nextInt();
		for(int i=a; i<=b;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
