package march_april_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Serialization4 {

	public static void main(String[] args) {
		Serialization4 obj1 = new Serialization4();
		System.out.println("Organization Name:: " + obj1.Organization + " License is:: " + obj1.license);
		try {
			FileOutputStream fos = new FileOutputStream(new File("E:\\File4.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream(new File("E:\\File4.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Serialization4 obj2 = (Serialization4) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Organization Name:: " + obj2.Organization + " License is:: " + obj2.license
					+ " Salary is:: " + obj2.salary+" Location is:: "+obj2.location);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
