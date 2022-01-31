package serialization_deserialzation;

import java.io.Serializable;

public class Using_Final_keyword implements Serializable {

	final String city;
	transient final int pincode;
	transient final double latitude;
	transient final double longitute = 77.1025;
	transient String address;

	public Using_Final_keyword(String c, int p, double lat, String a) {
		city = c;
		pincode = p;
		latitude = lat;
		address = a;
	}

}
