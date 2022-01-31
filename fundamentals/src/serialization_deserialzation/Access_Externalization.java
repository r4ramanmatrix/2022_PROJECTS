package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Externalization {

	public static void main(String[] args) {
		Externalization serial = new Externalization(110001, "New Delhi", "INDIA", 10);
		Externalization deserial = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("E:\\external.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serial);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {

		}
		System.out.println("Serialization Done!!");
		try {
			fis = new FileInputStream("E:\\external.ser");
			ois = new ObjectInputStream(fis);
			deserial = (Externalization) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {

		}
		System.out.println("Deserialization done!!");
		System.out.println("Details:: "+deserial.pincode+", "+deserial.country+", "+deserial.cityName+", "+deserial.street);
	}

}
