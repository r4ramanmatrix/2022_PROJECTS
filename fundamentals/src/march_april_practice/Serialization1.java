package march_april_practice;

import java.io.Serializable;

public class Serialization1 implements Serializable {

	String name;
	int age;
	transient String statement;

	public Serialization1(String n, int a, String s) {
		name = n;
		age = a;
		statement = s;
	}

}
