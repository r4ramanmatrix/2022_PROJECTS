package other_mixPractice;

import java.util.TreeSet;

public class Implementing_Hotel {

	public static void main(String[] args) {
		TreeSet<Hotel_Staff> ts = new TreeSet<Hotel_Staff>(new Using_Comparator_Hotel());
		ts.add(new Hotel_Staff("A", 31, 101));
		ts.add(new Hotel_Staff("Z", 77, 2));
		ts.add(new Hotel_Staff("X", 40, 151));

		for (Hotel_Staff hs : ts) {
			System.out.println(hs);
		}
	}

}
