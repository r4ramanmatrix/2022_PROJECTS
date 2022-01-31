package march_april_practice;

import java.io.Serializable;

public class Serial_Class implements Serializable {

	String name;
	int age;

	transient String gender;
	

	public Serial_Class(String n, int i, String g) {
		name = n;
		age = i;
		gender = g;

	}

}
