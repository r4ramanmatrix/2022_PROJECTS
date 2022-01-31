package march_april_practice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization2 implements Serializable {

	String name;
	transient int age;

	public Serialization2(String s, int i) {
		name = s;
		age = i;
	}

	private void writeObject(ObjectOutputStream oo) {
		try {
			oo.defaultWriteObject();
			int x = 100 + age;
			oo.writeObject(x);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream oi) {
		try {
			oi.defaultReadObject();
			int x = (int) oi.readObject();
			age = x - 100;
			/*
			 * String s = String.valueOf(x); if (s.contains("100")) { s =
			 * s.replace("100", ""); } x = Integer.parseInt(s); age = x;
			 */

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
