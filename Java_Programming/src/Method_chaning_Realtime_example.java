package methods_Progrmas;

public class Method_chaning_Realtime_example {

	//preparing an student data in the method cahnining//

	public String name;
	public int id;
	public String city;
	public String schoolname;

	public Method_chaning_Realtime_example studentname (String name) {
		this.name = name;
		return this;
	}


	public Method_chaning_Realtime_example studentid (int id) {
		this.id = id;
		return this;		
	}

	public Method_chaning_Realtime_example  studentcity(String city) {
		this.city = city;
		return this;
	}

	public Method_chaning_Realtime_example studentshoolname (String schoolname) {
		this.schoolname = schoolname;
		return this;
	}
	
       Method_chaning_Realtime_example() { 
    	   
    	   studentname("Mohammed Burhan Jabir").studentid(5789).studentcity("Chintamani").studentshoolname("M W A School");
       }
       
       @Override
	public String toString() {
	  return "student"+ name +"id"+id+"city"+city+"schoolname"+schoolname;
		
	}
	
	public static void main(String[] args) {

		Method_chaning_Realtime_example r = new Method_chaning_Realtime_example();
	r.studentname("Mohammed Burhan Jabir").studentid(5789).studentcity("Chintamani").studentshoolname("M W A School");

		System.out.println(r);
	}






}









