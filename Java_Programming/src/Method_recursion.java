package practic;

import java.util.Scanner;

public class Method_recursion {

	
	Scanner sc = new Scanner(System.in);
	sysout
	
	static int i= 10;
	
	public static void jabir() {
		
		System.out.println(i);
		
		if(i/2==0) {
			
			Method_recursion.jabir();
			
		}
	}
	public static void main(String[] args) {

		Method_recursion.jabir();

	}