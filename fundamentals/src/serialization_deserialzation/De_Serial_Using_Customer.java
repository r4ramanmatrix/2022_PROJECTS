package serialization_deserialzation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_Serial_Using_Customer {

	public static void main(String[] args) {
		Serial_customer obj1 = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(new File("E:\\Read.txt"));
			ois = new ObjectInputStream(fis);

			obj1 = (Serial_customer) ois.readObject();

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		System.out.println("Serial_Customer object de-serialized:: ");
		System.out.println(obj1);
	}

}
