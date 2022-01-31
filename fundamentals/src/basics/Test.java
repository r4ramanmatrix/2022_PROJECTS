package basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test extends RuntimeException {

	public static void main(String[] args) {
		/*
		 * System.out.println(10 / 0); throw new
		 * ArithmeticException("/ by zero");
		 */
		// System.out.println("Hallo");
		m1();
		m2();
		m3();
	}

	public static void m1() throws Test {
		System.out.println("THROWS");
	}

	public static void m2() {
		throw new Error();
	}

	public static void m3() {
		System.out.println(10 / 0);
		try {
			throw new RuntimeException("/ by zero");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(""))) {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
