package programmingClass;

public class Numbers {

	void num(int a){
		if(a<=10) {
		if(a%2==0){
		System.out.println(a);
		}
		a++;
		num(a);
		}
	}
	public static void main(String[]args){

		Numbers n = new Numbers();
		n.num(1);
		}

}
