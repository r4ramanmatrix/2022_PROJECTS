package interview_basic;

public class String_Reversing {

	public static void main(String[] args) {

		String name2 = "pratibha raman kumar sharma";

		String[] rev = name2.split(" ");

		for (int i = 0; i < rev.length; i++) {

			for (int j = rev[i].length() - 1; j >= 0; j--) {
				System.out.print(rev[i].charAt(j));
			}

			System.out.print(" ");
		}
	}

}
