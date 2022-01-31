package serialization_deserialzation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Transient_Serialize_deserialize implements Serializable {

	String city;
	transient double latitude;
	transient double longitude = 77.1025;

	public Transient_Serialize_deserialize(String c, double l) {
		city = c;
		latitude = l;
	}

	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			double tempLatitude = 100 + latitude;
			double tempLongitude = 100 + longitude;
			oos.writeDouble(tempLatitude);
			oos.writeDouble(tempLongitude);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			double tempLatitude = ois.readDouble();
			double tempLongitude = ois.readDouble();

			latitude = tempLatitude - 100;
			longitude = tempLongitude - 100;
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
