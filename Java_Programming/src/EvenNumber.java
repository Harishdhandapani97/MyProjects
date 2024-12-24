package programmingClass;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
	//print even numbers using scanner class
		
		Scanner s = new Scanner(System.in);
		System.out.println("eneter the number");
		int a= s.nextInt();
		if(a%2==0){
		System.out.println("it is even number");
		}
		else{
		System.out.println("it is not an even number");
		}
		}

	}


