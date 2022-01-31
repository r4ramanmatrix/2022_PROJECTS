package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_ArrayList {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Watermellon");
		fruits.add("Apple");
		fruits.add("Mango");
		for (String li : fruits) {
			System.out.println(li);
		}
		System.out.println("*************");
		Collections.sort(fruits);
		for (String li : fruits) {
			System.out.println(li);
		}
	}

}
