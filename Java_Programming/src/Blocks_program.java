package practic;

public class Blocks_program {
	
	static int age;
	
	String name;
	
	
	static {
		age=20;
	}
   public static void main(String[] args) {
	
	   System.out.println(age);
	   Blocks_program my = new Blocks_program();
	   System.out.println(my.name);
	   
	   System.out.println(age);
}
   
   {
	   age=25;
	   name="tom";
   }
}
