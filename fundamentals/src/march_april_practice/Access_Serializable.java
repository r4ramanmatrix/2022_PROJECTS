package march_april_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Serializable {

	public static void main(String[] args) {
		Serializable_Class obj1 = new Serializable_Class("Raman", 33);
		try {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			fos = new FileOutputStream(new File("E:\\practice_serial.ser"));
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
			System.out.println("Object Serialized!!");
		}

		System.out.println("Object start de-serialization!!");
		Serializable_Class obj2 = null;
		try {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			fis = new FileInputStream(new File("E:\\practice_serial.ser"));
			ois = new ObjectInputStream(fis);
			obj2 = (Serializable_Class) ois.readObject();
			ois.close();
			fis.close();
			System.out.println(obj2.name+".."+obj2.age);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
