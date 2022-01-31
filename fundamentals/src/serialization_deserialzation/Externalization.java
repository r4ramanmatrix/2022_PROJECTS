package serialization_deserialzation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Externalization implements Externalizable {

	int pincode;
	String cityName;
	String country;
	int street;

	public Externalization() {
		System.out.println("This is default Constructor");
	}

	public Externalization(int p, String city, String count, int s) {
		this();
		pincode = p;
		cityName = city;
		country = count;
		street = s;
	}

	public void writeExternal(ObjectOutput oo) {
		try {
			oo.writeInt(pincode);
			oo.writeObject(country);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public void readExternal(ObjectInput oi) {
		try {
			int tempPin = oi.readInt();
			String tempCountry = (String) oi.readObject();

			country = tempCountry;
			pincode = tempPin;
		} catch (IOException x) {
			x.printStackTrace();
		} catch (ClassNotFoundException x) {
			x.getMessage();
		}
	}

}
