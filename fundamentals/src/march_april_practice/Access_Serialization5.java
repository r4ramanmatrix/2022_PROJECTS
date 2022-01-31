package march_april_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Serialization5 {

	public static void main(String[] args) {
		Serialization5 obj1 = new Serialization5();
		/*System.out.println("Name is: " + obj1.name);
		System.out.println("Age is: " + obj1.age);
		System.out.println("Weight is: " + obj1.weight);*/
		try {
			FileOutputStream fos = new FileOutputStream("E:\\serial6.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("******** De-serialization **********");

		try {
			FileInputStream fis = new FileInputStream("E:\\serial6.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Serialization5 obj2 = (Serialization5) ois.readObject();
			ois.close();
			fis.close();

			System.out.println("Name is: " + obj2.name + " and Name is:: " + obj2.ename);
			System.out.println("Age is: " + obj2.age);
			System.out.println("Weight is: " + obj2.weight);
			System.out.println("Location is: " + obj2.location);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
