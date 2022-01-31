package serialization_deserialzation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Practice implements Serializable {

	transient String name = "Rama";
	transient int age;
	String city;

	public Practice(int i, String c) {
		age = i;
		city = c;
	}

	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			String tempName = "Test" + name;
			int tempAge = 100 + age;
			oos.writeObject(tempName);
			oos.writeInt(tempAge);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			String tempName = ois.readObject().toString();
			int tempAge = ois.readInt();
			name = tempName.substring(4);
			age = tempAge - 100;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
