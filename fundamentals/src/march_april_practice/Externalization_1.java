package march_april_practice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Externalization_1 implements Externalizable {

	String name;
	int age;

	public Externalization_1() {
		// TODO Auto-generated constructor stub
		System.out.println("No argument constructor!!");
	}

	public Externalization_1(String s, int i) {
		this.name = s;
		this.age = i;
	}

	@Override
	public void writeExternal(ObjectOutput oo) {
		try {
			oo.writeObject(name);
			oo.writeInt(age);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readExternal(ObjectInput oi) {
		try {
			name = (String) oi.readObject();
			age = oi.readInt();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		return "Name is: " + name + " Age is: " + age;
	}

}
