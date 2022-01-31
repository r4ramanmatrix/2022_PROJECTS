package march_april;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student_College_Employee_SE_DE {

	public static void main(String[] args) {
		Student_Serialized obj1 = new Student_Serialized("Raman", 42);
		College_Serialized obj2 = new College_Serialized("Raman", 325689);
		Employee_Serialized obj3 = new Employee_Serialized("Raman", 8068731);

		try {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			fos = new FileOutputStream(new File("E:\\mix.ser"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.writeObject(obj2);
			oos.writeObject(obj3);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Student_Serialized obj4 = null;
		College_Serialized obj5 = null;
		Employee_Serialized obj6 = null;

		try {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			fis = new FileInputStream(new File("E:\\mix.ser"));
			ois = new ObjectInputStream(fis);
			obj4 = (Student_Serialized) ois.readObject();
			obj5 = (College_Serialized) ois.readObject();
			obj6 = (Employee_Serialized) ois.readObject();
			ois.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(obj4.studentName + "===" + obj4.studentRollno);
		System.out.println(obj5.studentName + "===" + obj5.registrationNumber);
		System.out.println(obj6.empName + "===" + obj6.empId);
	}

}
