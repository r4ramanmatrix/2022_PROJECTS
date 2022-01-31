package march_april_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerialization_2 {

	public static void main(String[] args) {
		Serialization2 obj1 = new Serialization2("Raman", 33);
		System.out.println("Name is:: " + obj1.name + " Age is:: " + obj1.age);

		try {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			fos = new FileOutputStream(new File("E:\\File.ser"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream(new File("E:\\File.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Serialization2 obj2 = (Serialization2) ois.readObject();
			System.out.println("Name is:: " + obj2.name + " Age is:: " + obj2.age);
		
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
