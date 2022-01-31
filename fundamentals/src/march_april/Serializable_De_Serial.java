package march_april;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializable_De_Serial implements Serializable {

	public static void main(String[] args) {

		Serial_Class obj1 = new Serial_Class("Raman", 33);
		try {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;

			fos = new FileOutputStream(new File("E:\\Serializable.txt"));
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
		
		Serial_Class obj2=null;

		try {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			fis = new FileInputStream(new File("E:\\Serializable.txt"));
			ois = new ObjectInputStream(fis);
			obj2=(Serial_Class)ois.readObject();
			ois.close();
			fis.close();
			System.out.println("File after deserialize!!");
			System.out.println(obj2.name);
			System.out.println(obj2.age);
			System.out.println(obj2.n);
			System.out.println(obj2.x);
			System.out.println(obj2.z);
			System.out.println(obj2.r);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
