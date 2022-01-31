package exception_handling;

public class Examples_on_Exception_handling {

	public void m1() {
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());
			System.out.println("Arithmetic Exception Handled!!");
		}

		try {
			String str = null;
			int strLength = str.length();
			System.out.println(strLength);
		} catch (NullPointerException e) {
			System.out.println(e.toString());
			System.out.println("Null Pointer Exception handled!!");
		}

		try {
			int[] arr = { 11, 00, 22, 55 };
			System.out.println(arr[4]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println("Array Index Out of bound handled!!");
		}
	}

	public static void main(String[] args) {
		new Examples_on_Exception_handling().m1();
	}

}
