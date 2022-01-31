package march_april_practice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalClass1 implements Externalizable {

	String name;
	transient int age;

	public ExternalClass1() {
		System.out.println("No argument constructor!!");
	}

	public ExternalClass1(String s, int i) {
		name = s;
		age = i;
	}

	public void writeExternal(ObjectOutput os) {
		try {
			os.writeObject(name);
			os.writeInt(age);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readExternal(ObjectInput is) {
		try {
			name = (String) is.readObject();
			age = (int) is.readInt();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
