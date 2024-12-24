package programmingClass;

public class Friends {

	public static void main(String[] args) {

		String[] friends = { "sri", "Nithya", "kani", "maya", "nawina" };
		System.out.println("Friends name");
		for (int i = 0; i <= friends.length - 1; i++) {
			System.out.println(friends[i]);
		}
		for (int j = friends.length - 1; j >= 0; j--) {
			System.out.println(friends[j]);
		}

	}

}
