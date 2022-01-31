package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Using_static_variable {

	public static void main(String[] args) {
		Using_static_variable serial = new Using_static_variable("Delhi", 110001, 28.7041);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;

		Using_static_variable de_serial = null;

		try {
			fos = new FileOutputStream("E:\\static_var.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serial);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Serialization Done!!");

		try {
			fis = new FileInputStream("E:\\static_var.ser");
			ois = new ObjectInputStream(fis);
			de_serial = (Using_static_variable) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Details:: " + Using_static_variable.country + ", " + de_serial.city + ", "
				+ de_serial.pincode + ", " + de_serial.location);
		System.out.println("De-Serialization done!!");
	}
}
