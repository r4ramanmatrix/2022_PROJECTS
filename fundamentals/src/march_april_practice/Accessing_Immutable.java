package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Accessing_Immutable {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(901);
		li.add(401);
		li.add(501);
		li.add(601);
		Immutable_Class obj1 = new Immutable_Class("Raman", 33, li);

		System.out.println("Name is:: " + obj1.getName() + " Age is:: " + obj1.getAge() + " ID's :: " + obj1.getId());
		li.add(701);
		System.out.println(obj1.getId());
	}

}
