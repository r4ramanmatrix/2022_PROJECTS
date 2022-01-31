package serialization_deserialzation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AccessSender_SerialversionUID {

	public static void main(String[] args) {
		SerialversionUID serial = new SerialversionUID("Rama", 99999);
		FileOutputStream fos =null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("E:\\eUID.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serial);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Serialization Done!!");
	}

}
