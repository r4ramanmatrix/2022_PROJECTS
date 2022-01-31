package march_april_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Customized_Serialization3 {

	public static void main(String[] args) {
		Serialization3 obj1 = new Serialization3();
		try {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			fos = new FileOutputStream(new File("E:\\test1.ser"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("De-Serialization");

		try {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			fis = new FileInputStream(new File("E:\\test1.ser"));
			ois = new ObjectInputStream(fis);
			Serialization3 obj2 = (Serialization3) ois.readObject();
			ois.close();
			fis.close();

			System.out.println(
					"Salary is:: " + obj2.salary + " Grade is:: " + obj2.grade + " Employee id:: " + obj2.empId);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
