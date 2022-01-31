package lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting {

	public static void main(String[] args) {
		ArrayList<Organization> lists = new ArrayList<Organization>();
		lists.add(new Organization("Raman Kumar", 266));
		lists.add(new Organization("Mohit", 264));
		lists.add(new Organization("Rahul", 007));

		Collections.sort(lists);

		for (Organization or : lists) {
			System.out.println(or);
		}

	}

}
