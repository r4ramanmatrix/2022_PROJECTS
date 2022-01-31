package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_ImmutableClass3 {

	public static void main(String[] args) {
		List<String> lis = new ArrayList<String>();
		lis.add("X");
		lis.add("A");
		lis.add("Z");
		lis.add("P");

		Immutable_Class3 obj1 = new Immutable_Class3("Rama", 33, lis);
		System.out.println("Name is:: " + obj1.getName() + " Age is:: " + obj1.getAge() + " List of friends is:: "
				+ obj1.getList());

	}

}
