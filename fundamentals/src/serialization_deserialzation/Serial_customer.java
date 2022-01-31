package serialization_deserialzation;

import java.io.Serializable;

public class Serial_customer  implements Serializable{

	String name;
	int age;
	int eid;

	public Serial_customer(String n, int i, int a) {
		name = n;
		age = a;
		eid = i;
	}

	public String toString() {
		return "Name is:: " + name + " Age is:: " + age + " Employee id is:: " + eid;
	}

}
