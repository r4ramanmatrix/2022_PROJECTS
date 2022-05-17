package interview_questions;

public class Exception_Handling {

	public static void m1() {
		try {
			m2();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public static void m2() throws ArithmeticException {
		m3();
	}

	public static void m3() {

		throw new ArithmeticException("/0 divide by zero");

	}

	public static void main(String[] args) {
		m1();
	}

}
