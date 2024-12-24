package non_Static_programs;

public class Non_Static_Program1 {
	
	//Animals  which we have seen in our Life//
	  static String animal1="Tiger";
	  static String animal2="Lion";
	  static String animal3="rabbit";
	  
	  String animal4="tigers";
	  int tigers=4;
	  double price =820004.56d;
	  
	  
	  static void prop() {
		  System.out.println("These is the Tiger 1 here : "+animal1);
		
			System.out.println("These is the Price of the Tiger ");
	  }
	  static void prop1() {
		 System.out.println("These Is the Lions Here : "+animal2);
	  }
	  static void prop3() {
		  System.out.println("These Is the Rabbits Here : "+animal3);
	  }
	
public static void main(String[] args) {
	
	Non_Static_Program1 mdburhan = new Non_Static_Program1();
	System.out.println(mdburhan.animal1);
	System.out.println(mdburhan.animal2);
	System.out.println(mdburhan.animal3);
	System.out.println(mdburhan.animal4);
	
	mdburhan.prop();
	mdburhan.prop1();
	mdburhan.prop3();
	
	
	System.out.println(mdburhan.tigers);
	System.out.println(mdburhan.price);
	
}
}
