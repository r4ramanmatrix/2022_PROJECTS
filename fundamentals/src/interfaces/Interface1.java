package interfaces;

public interface Interface1 {

	interface child {

		public static void m1() {

			System.out.println("This is static method of child interface in Interface1");

		}

		public void msg();

		default void m2() {
			System.out.println("Default method");
		}

	}

	public static void main(String[] args) {

	}

}
