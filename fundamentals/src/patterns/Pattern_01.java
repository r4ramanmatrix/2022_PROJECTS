package patterns;

public class Pattern_01 {

	public static void m1(int n) {
		System.out.println("Pattern 1:: ");
		for (int i = 0; i < n; i++) {

			System.out.print("*");

		}
	}

	public static void m2(int n) {
		System.out.println("\nPattern 2:: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void m3(int n) {
		System.out.println("Pattern 3:: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void m4(int n) {
		System.out.println("Pattern 4:: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void m5(int n) {
		System.out.println("Pattern 5:: ");
	}

	public static void main(String[] args) {
		m1(5);
		m2(3);
		m3(5);
		m4(5);
	}

}
