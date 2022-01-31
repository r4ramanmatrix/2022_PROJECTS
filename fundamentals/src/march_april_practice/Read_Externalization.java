package march_april_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Read_Externalization {

	public static void main(String[] args) {
		Externalization_1 obj1 = new Externalization_1("Raman", 33);
		try {
			FileOutputStream fos = new FileOutputStream(new File("E:\\external_1.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Externalization_1 obj2 = null;
		try {
			FileInputStream fis = new FileInputStream(new File("E:\\external_1.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj2 = (Externalization_1) ois.readObject();
			ois.close();
			System.out.println(obj2);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
