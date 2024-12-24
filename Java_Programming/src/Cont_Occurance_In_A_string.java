package stringPrograms;

public class Cont_Occurance_In_A_string {

	public static void main(String[] args) {
		
		String str="Java Programm is Thea Bast of a";
		int totalcount=str.length();
		int total_numbers_after_replace=str.replace("a", "").length();
		
		int count =totalcount - total_numbers_after_replace;
		
		System.out.println(count);
	}

}
