package inheritance_methods;

public class Depatments extends College {

	String departmentname="ComputerScience";
	
	void CoursesinDepartent() {
		
		System.out.println("here in this you will learn about different computer courdes");
}
	
	public static void main(String[] args) {
		Depatments ds = new Depatments();
		ds.CoursesinDepartent();
		ds.collegeaddress();
		ds.conductExternals();
		System.out.println(ds.departmentname);
		System.out.println(ds.Collegename);
		System.out.println(ds.nameofuniversity);
	}
}