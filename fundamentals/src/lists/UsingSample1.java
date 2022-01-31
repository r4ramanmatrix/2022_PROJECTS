package lists;

import java.util.ArrayList;
import java.util.Collections;

public class UsingSample1 {

	public static void main(String[] args) {
		ArrayList<Sample1> lists = new ArrayList<>();
		lists.add(new Sample1("Raman", 266));
		lists.add(new Sample1("Rahul", 007));
		lists.add(new Sample1("Mohit", 264));
		lists.add(new Sample1("Joginder", 255));

		for (Sample1 s : lists) {
			System.out.println(s);
		}

		Collections.sort(lists);

		System.out.println("******Sort based on String******");

		for (Sample1 s1 : lists) {
			System.out.println(s1);
		}
	}

}
