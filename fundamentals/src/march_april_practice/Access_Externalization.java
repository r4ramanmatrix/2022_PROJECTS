package march_april_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Externalization {

	public static void main(String[] args) {
		ExternalClass1 obj1 = new ExternalClass1("Raman", 33);
		try {
			FileOutputStream fos = new FileOutputStream("E:\\external.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream("E:\\external.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ExternalClass1 obj2 = (ExternalClass1) ois.readObject();
			ois.close();
			fis.close();

			System.out.println("Name is:: " + obj2.name);
			System.out.println("Age is:: " + obj2.age);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
