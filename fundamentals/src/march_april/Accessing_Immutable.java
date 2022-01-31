package march_april;

import java.util.ArrayList;
import java.util.List;

public class Accessing_Immutable {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Swimming");
		li.add("Jogging");
		li.add("Driving");
		Immutable_Class obj1 = new Immutable_Class("X", 32, li);
		System.out.println(
				"Name is:: " + obj1.getName() + " Age is:: " + obj1.getAge() + " Hobbies:: " + obj1.getHobbies());
		li.add(obj1.getName());
		System.out.println(obj1.getHobbies());
		Immutable_Class obj2=new Immutable_Class("R", 33, li);
		System.out.println(obj2.getHobbies());

	}

}
