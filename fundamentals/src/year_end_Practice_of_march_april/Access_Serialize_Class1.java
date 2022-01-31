package year_end_Practice_of_march_april;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Access_Serialize_Class1 implements Serializable {

	public static void main(String[] args) {
		Serialize_Class1 obj1 = new Serialize_Class1("Rama", 1000);
		try {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			fos = new FileOutputStream(new File("E:\\Serialize.ser"));
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
		
	}
}
