package serialization_deserialzation;

import java.io.Serializable;

public class Using_static_variable implements Serializable{

	static String country = "INDIA";
	String city;
	int pincode;
	transient double location;

	public Using_static_variable(String c, int p, double l) {
		city = c;
		pincode = p;
		location = l;
	}

}
