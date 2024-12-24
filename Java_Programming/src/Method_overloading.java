package methods_Progrmas;
public class Method_overloading {
	
	
	public static void login(String emailid,String password){
		
		if(emailid=="mdburhanjabir311@gmail.com") {
			
			if(password=="6677889") {
				System.out.println("Login done sucessfully");
			}
			else {
				System.out.println("Wrong password entered please check");
			}
		}
		else {
			System.out.println("Wrong email id entered");}
		}

	public static void main(String[] args) {
		Method_overloading.login("mdburhanjabir311@gmail.com", "6677889");
		Method_overloading.login("mdburahnajbir@gamil.com", "843113456");
	}

}
