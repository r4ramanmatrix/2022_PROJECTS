package object_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetClassMethod {

	public static void main(String[] args) {
		GetClassMethod gets = new GetClassMethod();
		System.out.println(gets.getClass());

		Object obj = new Integer(100);
		Class c = obj.getClass();
		System.out.println("Package and Class Name: " + c.getName());

		int count = 0;
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Count is: " + count);
		System.out.println("****************");
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor cs1 : cs) {
			System.out.println(cs1.getName());
		}

		try {
			Connection con = DriverManager.getConnection("Raman");
			System.out.println(con.getClass().getName());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			gets.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
