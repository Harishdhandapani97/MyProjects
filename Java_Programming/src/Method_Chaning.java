package practic;

public class Method_Chaning {

	
	public void add() {
		sub();
		System.out.println("this is the the method one");
	}
	
	public void sub() {
		multiply();
		System.out.println("this is the Second method in this");
	}
	
	public void multiply() {
		System.out.println("this is the String of the Diven name");
	}
	
	public static void main(String[] args) {
		Method_Chaning jack = new Method_Chaning();
		jack.add();
	}
}
