package march_april_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Serialization6 {

	public static void main(String[] args) {
		Serialization6 obj1 = new Serialization6("Raman", 33, 5.6, 'A');
		Serialization7 obj7 = new Serialization7();
		obj7.x = 800;
		obj7.y = 999;
		try {
			FileOutputStream fos = new FileOutputStream("E:\\serial_6.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.writeObject(obj7);
			oos.flush();
			oos.close();
			System.out.println(obj1.name);
			System.out.println(obj1.height);
			System.out.println(obj1.age);
			System.out.println(obj1.grade);
			System.out.println(obj1.x);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("*********** De-Serialization ***********");

		try {
			FileInputStream fis = new FileInputStream("E:\\serial_6.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Serialization6 obj2 = (Serialization6) ois.readObject();
			Serialization7 obj71 = (Serialization7) ois.readObject();
			ois.close();
			System.out.println(obj2.name);
			System.out.println(obj2.height);
			System.out.println(obj2.age);
			System.out.println(obj2.grade);
			System.out.println(obj71.x+" === "+obj71.y);
			System.out.println("Name from child class:: " + obj71.name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
