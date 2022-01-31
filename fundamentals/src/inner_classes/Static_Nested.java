package inner_classes;

public class Static_Nested {

	int x = 99;
	static int y = 999;

	static class Inner {
		public void m1() {
			System.out.println("Static inner method");
			System.out.println(y);
			// System.out.println(x);
		}

		public static void m2() {
			System.out.println("Static method of static nested class");
		}

		public static void main(String[] args) {
			System.out.println("Static nested class main method");
		}
	}

	public static void main(String[] args) {
		Inner iobj = new Inner();
		iobj.m1();
		Inner.m2();
		Inner.main(args);
	}

}
