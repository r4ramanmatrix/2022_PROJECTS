package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Using_Final_keyword {

	public static void main(String[] args) {
		Using_Final_keyword serial = new Using_Final_keyword("New Delhi", 110001, 28.7041, "central delhi");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;

		Using_Final_keyword deserial = null;
		try {
			fos = new FileOutputStream("E:\\final.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serial);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		System.out.println("Serialization Done!!");

		try {
			fis = new FileInputStream("E:\\final.ser");
			ois = new ObjectInputStream(fis);
			deserial = (Using_Final_keyword) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("De-Serialization Done!!!");
		System.out.println("Details are:: " + deserial.city + ", " + deserial.pincode + ", " + deserial.latitude + ", "
				+ deserial.longitute + ", " + deserial.address);
	}

}
