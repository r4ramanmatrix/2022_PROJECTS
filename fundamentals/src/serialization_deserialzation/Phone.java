package serialization_deserialzation;

import java.io.Serializable;

public class Phone implements Serializable {

	int countryCode;
	int mNumber;

	public Phone(int c, int m) {
		countryCode = c;
		mNumber = m;
	}

	public String toString() {
		return countryCode + " | " + mNumber;
	}

}
