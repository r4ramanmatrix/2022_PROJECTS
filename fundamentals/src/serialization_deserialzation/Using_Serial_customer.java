package serialization_deserialzation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Using_Serial_customer {

	public static void main(String[] args) {
		Serial_customer obj1 = new Serial_customer("ABC", 201, 33);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(new File("E:\\Read.txt"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("File written successfully!!!");
		}
	}

}
