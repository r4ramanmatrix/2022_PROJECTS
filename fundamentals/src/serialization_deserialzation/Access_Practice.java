package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Practice {

	public static void main(String[] args) {
		Practice serial = new Practice(1000, "New Delhi");
		Practice deserial = null;

		FileOutputStream fos = null;
		FileInputStream fis = null;
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
			System.out.println(e.toString());
		}
		System.out.println("Serialize done!!");
		try {
			fis = new FileInputStream("E:\\read_transient.ser");
			ois = new ObjectInputStream(fis);
			deserial = (Practice) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("De-Serialize done!!");
		System.out.println("Details:: " + deserial.name + ", " + deserial.age + ", " + deserial.city);
	}

}
