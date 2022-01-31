package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_Immutable10 {

	public static void main(String[] args) {
		List<String> listing = new ArrayList<String>();

		listing.add("Cricket");
		listing.add("Football");
		listing.add("Hockey");
		listing.add("Badminton");

		Immutable_Class10 obj1 = new Immutable_Class10("Raman", 33, listing);
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getGamesList());

		listing.add("Handball");
		System.out.println(obj1.getGamesList());
	}

}
