package lists;

import java.util.ArrayList;
import java.util.Collections;

public class Using_Comparator {

	public static void main(String[] args) {
		ArrayList<Implementing_Comparator> lists = new ArrayList<>();
		lists.add(new Implementing_Comparator("Raman", 266));
		lists.add(new Implementing_Comparator("Rahul", 007));
		lists.add(new Implementing_Comparator("Mohit", 264));
		lists.add(new Implementing_Comparator("Joginder", 255));
		for (Implementing_Comparator ob : lists) {
			System.out.println(ob);
		}

		Collections.sort(lists, new EmpID_Comparator());
		System.out.println("**********");
		for (Implementing_Comparator obj : lists) {
			System.out.println(obj);
		}

	}

}
