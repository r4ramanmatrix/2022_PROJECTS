package serialization_deserialzation;

import java.io.Serializable;

public class ArrayList_Customer_Details implements Serializable {

	private static final long serialVersionUID = 100l;

	String name;
	int id;
	String country;

	public ArrayList_Customer_Details(String c, int e, String count) {
		name = c;
		id = e;
		country = count;
	}

	public String toString() {
		return name + ", " + id + ", " + country;
	}

}
