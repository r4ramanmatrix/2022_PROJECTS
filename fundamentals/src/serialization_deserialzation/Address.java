package serialization_deserialzation;

import java.io.Serializable;

public class Address implements Serializable {

	int houseNo;
	int streetNumber;
	String location;

	public Address(int h, int s, String l) {
		houseNo = h;
		streetNumber = s;
		location = l;
	}

	public String toString() {
		return houseNo + " | " + streetNumber + " | " + location;
	}

}
