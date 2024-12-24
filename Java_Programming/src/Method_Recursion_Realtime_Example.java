package methods_Progrmas;

public class Method_Recursion_Realtime_Example {

//	static int i=56;
//	
//	public static void Khan() {
//		
//		System.out.println(i);
//		i++;
//		if(i<=99) {
//			System.out.println(i);
//		}
//	}
//	
//	public static void main(String[] args) {
//		Method_Recursion_Realtime_Example.Khan();
//
//	}
	
//	static int i=2;
//public static void kahn() {
//	
//	System.out.println(i);
//	i++;
//	
//	if(i%2==0) {
//		
//		Method_Recursion_Realtime_Example.kahn();
//}
//	}
//
//public static void main(String[] args) {
//	
//	Method_Recursion_Realtime_Example.kahn();
//}
//
//}
	
	
	static int j=10;
	
	public static void jabir() {
		System.out.println(j);
		j--;
		
		if(j%2!=0) {
			
			Method_Recursion_Realtime_Example.jabir();
		}
	}
	public static void main(String[] args) {
		
		Method_Recursion_Realtime_Example.jabir();
		
	}
}

   
