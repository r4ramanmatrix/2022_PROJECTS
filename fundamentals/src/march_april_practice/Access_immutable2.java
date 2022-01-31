package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_immutable2 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("Badminton");
		li.add("Football");
		li.add("Cricket");
		li.add("Hockey");
		Immutable_Class2 obj1 = new Immutable_Class2("Raman", 33, li);
		System.out.println(obj1.getName() + " AND " + obj1.getage());
		System.out.println(obj1.getGamesList());
	}

}
