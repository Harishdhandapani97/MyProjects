package conditional_statements_realtime_programs;

import java.util.Scanner;

public class If_else_If_Realtime_example{

	private static final int rate = 100;
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// a user came in to the grocery website in the area//
		//in his pocket he has 500 rupees//
		//in this 500 rupees he want to buy the vegetables suggeste him to take it/
		//tomato range between 30 to 50 1
		//potato range between 50 to 70 2
		//carrot range between 70 to 90  3
		//ladies finger between 90 to 110 4
		//chillies range between 20 to 40 5

		//	   if(rate>=30 && rate<=50) {
		//		   System.out.println("you can buy this tomatos");
		//	   }
		//	   else if(rate>=50 && rate<=70) {
		//		   System.out.println("This you can buy but 50/50 is potato");
		//	   }
		//	   else if(rate>=70 && rate<=90) {
		//		   System.out.println("This Veagetable youc can buy  carrot ");
		//	   }
		//	   else if(rate>=90 && rate<=110) {
		//		   System.out.println("this the best option for you ladies Finger");
		//	   }
		//	   else if(rate>=20 && rate<=40) {
		//		   System.out.println("this the best welcome back option chillies");
		//	   }
		//	   else {
		//		   System.out.println("nothing is there here");
		//	   }

		Scanner s = new Scanner(System.in);
		System.out.println("enter you day");
		int day=s.nextInt();

		if(day==1) {
			System.out.println("You can go for home");
		}
		else if(day==2) {
			System.out.println("you can go for party");
		}
		else if(day<=4) {
			System.out.println("you acn go for shoping mall");
		}
		else if(day>=5) {
			System.out.println("you can go for park");
		}
		else if(day==6) {
			System.out.println("you can go for haircutting shop");
		}
		else if(day==7) {
			System.out.println("you can go for fun with your family outside");
		}
		else {
			System.out.println("don't go anywhere sit in home and watch Tv");	}
	}
}
