package narrowing_Programs;

public class Narrowing_Double_to_Int {

	public static void main(String[] args) {
		
		int a = 50;
		double b =a;
		int c = (int) b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
