package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Serialization_Practice1 {

	public static void main(String[] args) {
		Serialization_Practice1 obj1 = new Serialization_Practice1();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("E:\\Server1.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {

		}

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Serialization_Practice1 obj2 = null;
		try {
			fis = new FileInputStream("E:\\Server1.ser");
			ois = new ObjectInputStream(fis);
			obj2 = (Serialization_Practice1) ois.readObject();
			ois.close();
			fis.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Details :: "+obj2.name+", "+obj2.age+", "+obj2.gender);
	}

}
