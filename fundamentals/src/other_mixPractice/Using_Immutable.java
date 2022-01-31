package other_mixPractice;

import java.util.ArrayList;
import java.util.List;

public class Using_Immutable {

	public static void main(String[] args) {
		String ename = "Aditya";
		List<String> listing = new ArrayList<>();
		listing.add("Swimming");
		listing.add("Jogging");
		listing.add("Badminton");
		listing.add("Wandering");
		Immutable_class obj1 = new Immutable_class("Raman", 32, listing);
		System.out.println(
				"Name is:: " + obj1.getName() + " Age is:: " + obj1.getAge() + " Hobbies::" + obj1.getHobbies());

		listing.add("Listening Music");
		System.out.println("Hobbies::" + obj1.getHobbies());

		Immutable_class obj2 = new Immutable_class(ename, 32, listing);
		System.out.println(
				"Name is:: " + obj2.getName() + " Age is:: " + obj2.getAge() + " Hobbies::" + obj2.getHobbies());
		ename = "Apple";
		System.out.println(obj2.getName());
	}

}
