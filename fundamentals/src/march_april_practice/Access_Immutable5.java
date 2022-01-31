package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_Immutable5 {

	public static void main(String[] args) {
		List<String> listing = new ArrayList<String>();
		listing.add("Delhi");
		listing.add("Mumbai");
		listing.add("Pune");
		listing.add("Hyderabad");
		Immutable_Class5 obj1 = new Immutable_Class5("Raman", 33, listing);
		System.out.println("Name is:: "+obj1.getName()+" Age is:: "+obj1.getAge()+" Location are:: "+obj1.getList());
		listing.add("Bangalore");
		System.out.println("Location are:: "+obj1.getList());

	}

}
