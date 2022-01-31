package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_Immutable_Class9 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("INDIA");
		li.add("SINGAPORE");
		li.add("MALDIVES");
		Immutable_Class9 obj1 = new Immutable_Class9("Raman", 8068731, li);
		System.out.println(
				"Name is:: " + obj1.getName() + " Employee :: " + obj1.getEid() + " Places are:: " + obj1.getPlaces());
		li.add("EGYPT");
		System.out.println(obj1.getPlaces());
	}

}
