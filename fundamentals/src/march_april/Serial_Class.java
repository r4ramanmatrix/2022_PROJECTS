package march_april;

import java.io.Serializable;

public class Serial_Class implements Serializable {

	String name;
	int age;
	transient int n = 99;
	transient final int x = 100;
	static int z=78;
	transient static int r=78;

	public Serial_Class(String n, int a) {
		name = n;
		age = a;
	}

	/*
	 * public String toString() { return "Name is:: " + name + " Age is:: " +
	 * age; }
	 */

}
