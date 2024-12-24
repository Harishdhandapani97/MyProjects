package methods_Progrmas;

public class Constructer_Method_Program {

	//Film ticket booking bookmyshow realtime example//

	static String filmbook1= "the stree 2 film you can book";
	static String filmbook2="the kalki movie film you can book";

	String filmbbok3= "The avengers endgame movie you can book";
	String filmbook4="The Baby movie you can book";

	static void filmbook1() {
		System.out.println("the price of this film is 1000/-"+filmbook1);
	}

	static void filmbook2() {
		System.out.println("the price of this film is 2000/-"+filmbook2);
	}

	void filmbook3() {
		System.out.println("The price of this film is 4000/-"+filmbbok3);
	}

	void filmbook4() {
		System.out.println("The price of this Film is 8000/-"+filmbook4);
	}


	public static void main(String[] args) {
		Constructer_Method_Program.filmbook1();
		Constructer_Method_Program.filmbook2();
		
		Constructer_Method_Program p = new Constructer_Method_Program();
		p.filmbook3();
		p.filmbook4();

      


	}

}
