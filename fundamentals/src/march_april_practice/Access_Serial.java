package march_april_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Access_Serial implements Serializable{

	public static void main(String[] args) {
		Serial_Class obj1 = new Serial_Class("Raman", 33, "male");

		try {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;

			fos = new FileOutputStream(new File("E:\\Serializable_1.ser"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Java object serialized!!");
		}

		
		Serial_Class obj2 = null;
		try {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			fis = new FileInputStream(new File("E:\\Serializable_1.ser"));
			ois = new ObjectInputStream(fis);
			obj2 = (Serial_Class) ois.readObject();
			ois.close();
			fis.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(obj2.name + "..." + obj2.age + "..." + obj2.gender);
		
	}

}
