package march_april_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Serialization1 {

	public static void main(String[] args) {
		Serialization1 obj1 = new Serialization1("Rama", 33, "this is string");
		try {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			fos = new FileOutputStream(new File("E:\\Serialization1.ser"));
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
			System.out.println("File Serialized!!");
		}

		Serialization1 obj2 = null;

		try {
			FileInputStream fis = new FileInputStream(new File("E:\\Serialization1.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj2 = (Serialization1) ois.readObject();
			ois.close();
			fis.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(obj2.name+ "===="+obj2.age+"===="+obj2.statement);
	}

}
