package serialization_deserialzation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Using_Serialization_1 {

	public static void main(String[] args) {
		Serialization_1 obj1 = new Serialization_1("Raman", 33);
		System.out.println(obj1);

		try {
			FileOutputStream fos = new FileOutputStream(new File("E:\\Serialization_1.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(new File("E:\\Serialization_1.ser"));
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("**************** De-Serialization **************");
		Serialization_1 obj2 = null;
		try {
			FileInputStream fis = new FileInputStream(new File("E:\\Serialization_1.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj2 = (Serialization_1) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(obj2);
	}

}
