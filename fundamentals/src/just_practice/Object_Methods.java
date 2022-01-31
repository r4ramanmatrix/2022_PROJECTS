package just_practice;

import java.lang.reflect.Method;

public class Object_Methods {

	public static void main(String[] args) throws Exception {
		int count = 0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			System.out.println(m1);
			count++;
		}
		System.out.println("Number of methods in count:: " + count);
	}

}
