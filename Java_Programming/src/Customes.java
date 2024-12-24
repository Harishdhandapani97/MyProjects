package practic;

public class Customes extends Bank {

	public static void main(String[] args) {

		Bank bs = new Customes();
		//System.out.println("thsu sjsqj");
		bs.setAccountnumber(6779300);
		bs.setBankifsccode("Sbunooso");
		bs.setBankname("Canara bank");
		bs.setMypin(6543);
		bs.setPincode(563145);
		System.out.println("----------------------------");
		System.out.println(bs.getAccountnumber());
		System.out.println(bs.getBankifsccode());
		System.out.println(bs.getBankname());
		System.out.println(bs.getMypin());
		System.out.println(bs.getPincode());
	}

}
