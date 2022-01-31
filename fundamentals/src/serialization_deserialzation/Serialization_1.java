package serialization_deserialzation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_1 implements Serializable {

	String name;
	transient String place = "New Delhi";
	int age;

	public Serialization_1(String s, int i) {
		name = s;
		age = i;
	}

	public String toString() {
		return "Name is:: " + name + " Place is:: " + place + " Age is:: " + age;
	}

	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			String S1 = "New Delhi" + "Ayo";
			oos.writeObject(S1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			String S1 = (String) ois.readObject();
			place=S1.replace("Ayo", "");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
