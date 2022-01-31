package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AccessReceiver_SerialversionUID {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		SerialversionUID deserial = null;
		try {

			fis = new FileInputStream("E:\\eUID.ser");
			ois = new ObjectInputStream(fis);
			deserial = (SerialversionUID) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Details:: " + deserial.name + ", " + deserial.id);
		System.out.println("Deserialization Done!!");
	}

}
