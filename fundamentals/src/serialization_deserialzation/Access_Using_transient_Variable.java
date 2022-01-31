package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access_Using_transient_Variable {

	public static void main(String[] args) {
		Using_transient_Variable obj1 = new Using_transient_Variable("Rama", 999999, 109875);
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("E:\\transientVariable.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
			fos.close();
			System.out.println("Serialization Successful!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Using_transient_Variable obj2 = null;
		System.out.println("De-Serialization start!!!");
		try {
			fis = new FileInputStream("E:\\transientVariable.ser");
			ois = new ObjectInputStream(fis);
			obj2 = (Using_transient_Variable) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("After de-serialization:: " + obj2.Name + ", " + obj2.id + ", " + obj2.SSN);
		System.out.println("De-Serialization Done!!");
	}

}
