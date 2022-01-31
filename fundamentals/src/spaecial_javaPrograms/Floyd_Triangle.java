package spaecial_javaPrograms;

public class Floyd_Triangle {

	public static void m1(int value) {
		int k = 1;
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
		System.out.println("**********************************");
		int number = 10;
		m1(number);

	}

}
