package march_april_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_serial6 {

	public static void main(String[] args) {
		Serial6 obj1 = new Serial6("Raman", 33);
		try {
			FileOutputStream fos = new FileOutputStream("E:\\serial6.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Serial6 obj2 = null;
		try {
			FileInputStream fis = new FileInputStream("E:\\serial6.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj2 = (Serial6) ois.readObject();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Name is:: "+obj2.name+" Age is:: "+obj2.age);
	}

}
