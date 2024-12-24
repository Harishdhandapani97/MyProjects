package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.println("Enter Your String Here : ");
		String sm=st.next();
		System.out.println("Enter your Second String Here : ");
		String su=st.next();
		
		char [] a1=sm.toCharArray();
		char [] a2=su.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)==true) {
			
			System.out.println("it is an Anagram String");
		}
		else {
			System.out.println("it is not an Anagram String");
		}
	}

}
