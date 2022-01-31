package march_april_practice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Serial6 implements Externalizable {

	String name;
	int age;

	public Serial6(String s, int i) {
		super();
		name = s;
		age = i;
	}

	public Serial6() {
		System.out.println("No argument constructor!!");
	}

	public void writeExternal(ObjectOutput oo) {
		try {
			oo.writeObject(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readExternal(ObjectInput oi) {
		try {
			String sname = (String) oi.readObject();
			name = sname;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
