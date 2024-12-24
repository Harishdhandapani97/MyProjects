package arrays_concepets;

public class Creating_an_Array {

	public static void main(String[] args) {

//  int age[];//declartion
//  
//   age= new int[5]; //allocation of memory
//   
//   age[0]=53;
//   age[1]=45;
//   age[2]=99;
//   
//   System.out.println(age[0]);
//   System.out.println(age[1]);
//   System.out.println(age[2]);
//   System.out.println(age[3]);
//   
//   System.out.println(age.length);
//   
		
//		int[] ages= {5,15,20,89,30,25};
//		
//		for(int i=0;i<ages.length;i++) {
//			
//			System.out.println("the ages of "+ages[i]);
//		}
		
		
		String names [] = {"Mohammed","burhan","jabir","Khan","salman","sharukh khan"};
		
//		for(int i=0;i<names.length;i++) {
//			
//			System.out.println("The Names are "+names[i]);
//		}
		
		for (String name : names) {
			
			System.out.println(name);
		}
		
		// adding sum of these values
		int numbers[]=  {45,67,43,99,100,10001,8638};
		
		int sum=0;
		
		for (int num : numbers) {
			
			sum +=num;
			System.out.println("the sum of the numbers are"+sum);
		}
	}

	// Finding the smallest number in this Array
	int[] numbers=  {45,67,43,99,100,10001,8638};
	
	int min=Integer.MAX_VALUE;
	
	for(int jabir :numbers ) {
		
		if(numbers<min) {
			
			min=numbers;
		}
	
		System.out.println("the minimum"+min);
	}

}


