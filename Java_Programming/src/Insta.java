package programmingClass;

public class Insta {

	String user="sri";
	int pass=1234;
	long mno=9988776655l;

	void login(String uname,int pwd) {
	if(uname==user){
		if(pwd==1234){
			System.out .println("login successfull");
		}
		else{
			System.out .println("wrong password");
		}
	}
	else{
	System.out .println("wrong username");
	}
	}

	void login(long num,int pwd) {
	if(num==mno){
		if(pwd==pass){
			System.out .println("logn successfull");
			}
		else{
			System.out .println("wrong password");
	}
		}
	else{
		System.out .println("wrong number");
	}	
	}
	public static void main(String[]args){
	Insta i = new Insta();
	i.login("sri",1234);
	i.login(998877665l, 1234);
	}

}
