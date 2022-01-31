package encapsulation;

import java.util.Arrays;
import java.util.Set;

public class AnotherClass {

	Example1 ex;
	Set s;

	public void m1() {
		System.out.println(ex.a);
	}

	public static void main(String[] args) {

		System.out.println(new AnotherClass().s);
		Example1 obj = new Example1(30, "Raman");
		Example1 obj1 = new Example1(28, "Kumar");
		Example1[] e = new Example1[2];
		e[0] = obj;
		e[1] = obj1;

		System.out.println(e[0]);

		for (Example1 ee : e) {
			System.out.println(ee.age + " " + ee.name);
		}
		int[] arr = new int[5];
		Arrays.fill(arr, 200);
		for (int n1 : arr) {
			System.out.println(n1);
		}
		Arrays.sort(arr);
	}

}
