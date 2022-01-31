package march_april_practice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization4 implements Serializable {
	String Organization = "RBS";
	transient int license = 1188995471;
	transient double salary = 12356.5;
	transient String location = "NY";

	private void writeObject(ObjectOutputStream os) {
		try {
			os.defaultWriteObject();
			int x = 100 + license;
			os.writeObject(x);

			double d = 101.10 + salary;
			os.writeDouble(d);

			String s = "US" + location;
			os.writeObject(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		try {
			is.defaultReadObject();
			int x = (int) is.readObject();
			license = x - 100;

			double d = (double) is.readDouble();
			salary = d - 101.10;

			String s = (String) is.readObject();
			location = s.replace("US", "");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
