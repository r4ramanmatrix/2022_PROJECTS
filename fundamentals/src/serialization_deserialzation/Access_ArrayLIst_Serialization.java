package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class Access_ArrayLIst_Serialization {

	public static void main(String[] args) {

		ArrayLIst_Serialization serial = new ArrayLIst_Serialization();
		ArrayLIst_Serialization deserial = null;

		FileOutputStream fos = null;
		FileInputStream fis = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		try {
			fos = new FileOutputStream("E:\\Arraylist.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serial);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Serialized Done!!");
		try {
			fis = new FileInputStream("E:\\Arraylist.ser");
			ois = new ObjectInputStream(fis);
			deserial = (ArrayLIst_Serialization) ois.readObject();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Deserialization Done!!");
		System.out.println("Details are :: ");
		Iterator<String> itr = deserial.li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
