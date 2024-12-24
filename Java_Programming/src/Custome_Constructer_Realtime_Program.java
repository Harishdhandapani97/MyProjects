package methods_Progrmas;

public class Custome_Constructer_Realtime_Program {
	private static final int modelno = 0;
	// laptop device properties or specification//
	
	
	//	String a ="laptopbrand";
	//	String b ="color";
	//	int c =887766445;
	//	int d=6;
	//	String e = "500gb";
	//	processor

	private static final int ram = 0;

	String a = "brand";
	String b = "color";
	int  c= modelno;
	int  d= ram;
	String  e= "storage";
	String  f= "processor";
	public Custome_Constructer_Realtime_Program(String a, String b, int c, int d, String e, String f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public static void main(String[] args) {

		Custome_Constructer_Realtime_Program c1 = new Custome_Constructer_Realtime_Program("acer", "blue", 66778899, 4, "500gb", "acerproccesor");
		Custome_Constructer_Realtime_Program c2 = new Custome_Constructer_Realtime_Program("lenovo", "balck", 6655443, 8, "600gb", "lenovo processor");
		Custome_Constructer_Realtime_Program c3 = new Custome_Constructer_Realtime_Program("hp", "yellow", 55002233, 10, "700gb", "hp processor");
		Custome_Constructer_Realtime_Program c4 = new Custome_Constructer_Realtime_Program("Dell", "grey", 77002211, 15, "800gb", "Dellprocessor");
		
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		
	}

	public void display() {
		
		System.out.println("The Brand"+a+"The original color"+b+"The brand no of this model no is "+ c+"This model ram is"+d+"The storage of this system is"+e+"The laptop processor is "+f);
		
		
	}

}
