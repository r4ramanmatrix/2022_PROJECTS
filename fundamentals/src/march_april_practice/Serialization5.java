package march_april_practice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization5 extends Serial_1 implements Serializable {

	String name = "Raman";
	int age = 33;
	transient double weight = 69.5;
	static transient String location = "West SagarPur";

	public Serialization5() {
		System.out.println("Child class constructor");
	}

	/*
	 * public String toString() { return "Name is:: " + name + " Age is:: " +
	 * age + "Weight is: " + weight; }
	 */

	private void writeObject(ObjectOutputStream os) {
		try {
			os.defaultWriteObject();
			double d = 100 + weight;
			os.writeDouble(d);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		try {
			is.defaultReadObject();
			double d = (double) is.readDouble();
			weight = d - 100;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
