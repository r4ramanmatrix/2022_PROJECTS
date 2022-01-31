package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_Immutable4 {

	public static void main(String[] args) {
		List<String> lis = new ArrayList<String>();
		lis.add("Holi");
		lis.add("Deepawali");
		lis.add("Janmasthami");
		lis.add("Dusherra");

		Immutable_Class4 obj1 = new Immutable_Class4("Raman", 33, lis);
		System.out.println("Name is:: " + obj1.getName() + " Age is:: " + obj1.getAge() + " List of Holidays :: "
				+ obj1.getListOfHolidays());

		lis.add("Christmas");
		System.out.println(obj1.getListOfHolidays());
		Immutable_Class4 obj2 = new Immutable_Class4("Raman", 33, lis);
		System.out.println(obj2.getListOfHolidays());
		
	}

}
