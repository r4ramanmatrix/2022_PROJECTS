package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Transient_Serialize_deserialize {

	public static void main(String[] args) {
		Transient_Serialize_deserialize serial = new Transient_Serialize_deserialize("New Delhi", 28.7041);
		Transient_Serialize_deserialize deserial = null;

		FileInputStream fis = null;
		FileOutputStream fos = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("E:\\read_transient.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serial);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Serialization Done!!");

		try {
			fis = new FileInputStream("E:\\read_transient.ser");
			ois = new ObjectInputStream(fis);
			deserial = (Transient_Serialize_deserialize) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		System.out.println("De-Serialization Done!!");

		System.out.println("Details:: " + deserial.city + ", " + deserial.latitude + ", " + deserial.longitude);
	}

}
