package serialization_deserialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Access_ArrayList_Customer_Details {

	public static void main(String[] args) {
		ArrayList<ArrayList_Customer_Details> li = new ArrayList<>();
		ArrayList_Customer_Details customer1 = new ArrayList_Customer_Details("Emp1", 102, "INDIA");
		ArrayList_Customer_Details customer2 = new ArrayList_Customer_Details("Emp2", 802, "UK");
		ArrayList_Customer_Details customer3 = new ArrayList_Customer_Details("Emp3", 402, "INDIA");
		ArrayList_Customer_Details customer4 = new ArrayList_Customer_Details("Emp4", 602, "USA");

		li.add(customer1);
		li.add(customer2);
		li.add(customer3);
		li.add(customer4);

		ArrayList<ArrayList_Customer_Details> deserial = null;

		FileOutputStream fos = null;
		FileInputStream fis = null;

		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		try {
			fos = new FileOutputStream("E:\\Arraylist_With_Customer.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(li);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Serialization Done!!");

		try {
			fis = new FileInputStream("E:\\Arraylist_With_Customer.ser");
			ois = new ObjectInputStream(fis);
			deserial = (ArrayList<ArrayList_Customer_Details>) ois.readObject();
			ois.close();
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {

		}
		System.out.println("Deserialization Done!!");
		for (ArrayList_Customer_Details al : deserial) {
			System.out.println(al);
		}
	}

}
