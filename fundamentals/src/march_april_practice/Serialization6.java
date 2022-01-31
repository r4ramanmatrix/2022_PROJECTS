package march_april_practice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization6 implements Serializable {

	String name;
	int age;
	transient double height;
	transient static char grade;
	int x=99;

	public Serialization6(String s, int i, double d, char c) {
		name = s;
		age = i;
		height = d;
		grade = c;
	}

	public Serialization6() {
		System.out.println("Parent class NO-ARGS CONSTRUCTOR");
	}

	private void writeObject(ObjectOutputStream os) {
		try {
			os.defaultWriteObject();
			double di = height + 50.0;

			os.writeDouble(di);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream oi) {
		try {
			oi.defaultReadObject();
			double di = (double) oi.readDouble();
			height = di - 50.0;

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
