package march_april_practice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization3 implements Serializable {

	String ename;
	transient double salary;
	transient char grade;
	transient int empId;

	public Serialization3() {
		ename = "Employee";
		salary = 100000.250;
		grade = 'C';
		empId = 8065412;
	}

	private void writeObject(ObjectOutputStream os) {
		try {
			os.defaultWriteObject();
			double d = salary + 100;
			char ch = (char) ('Z' + grade);
			int i = (int) 10000 + empId;
			
			os.writeDouble(d);
			os.writeObject(ch);
			os.writeObject(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		try {
			is.defaultReadObject();
			double d = (double) (is.readDouble());
			salary = d - 100;

			char ch = (char) is.readObject();
			grade = (char) (ch - 'Z');

			int i = (Integer) is.readObject();
			empId = i - 10000;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
