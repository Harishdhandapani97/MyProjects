package stringPrograms;

import java.util.Scanner;

public class Maximum_lenght_in_String {

	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str=sm.nextLine();
		str=str+"";
		int length=str.length();
		String w="";
		String longlength="";
		
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			
			if(ch != '' ) {
				w=w+ch;
			}
			else {
				
				if(longlength.length() > w.length()) {
					
					longlength=w;
				}
				w="";
			}
		}
		System.out.println("the Longest Length of the Given String is : "+longlength);
	}

}
