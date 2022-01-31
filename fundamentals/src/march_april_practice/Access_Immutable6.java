package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_Immutable6 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("Mango");
		li.add("Apple");
		li.add("Grapes");
		li.add("Melon");
		Immutable_Class6 obj1 = new Immutable_Class6("Raman", 33, li);
		System.out.println(
				"Name is:: " + obj1.getName() + " Age is:: " + obj1.getAge() + " Fruits are:: " + obj1.getFruits());

		li.add("Banana");
		System.out.println("Fruits are:: " + obj1.getFruits());
	}

}
