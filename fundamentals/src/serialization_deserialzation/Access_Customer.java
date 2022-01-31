package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Customer {

	public static void main(String[] args) {
		Address add1 = new Address(57, 10, "New Delhi");
		Phone phn1 = new Phone(91, 989898989);

		Customer serial = new Customer("Rama", 8068731, add1, phn1);
		Customer deserial = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fos = new FileOutputStream("E:\\Aggregation.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serial);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fis = new FileInputStream("E:\\Aggregation.ser");
			ois = new ObjectInputStream(fis);
			deserial = (Customer) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Details:: " + deserial.custName + ", " + deserial.custId + ", " + deserial.address + ", "
				+ deserial.phone);
	}

}
