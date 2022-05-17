package basics_package_2022;

import java.util.TreeSet;

public class Access_Comparator_Practice_1 {

	public static void main(String[] args) {
		TreeSet<Comparator_Practice_1> obj = new TreeSet<Comparator_Practice_1>(
				new Implementing_Comparator_Practice_1());
		obj.add(new Comparator_Practice_1("ABC", 56));
		obj.add(new Comparator_Practice_1("XYZ", 26));
		obj.add(new Comparator_Practice_1("DCB", 59));
		obj.add(new Comparator_Practice_1("XCB", 86));
		obj.add(new Comparator_Practice_1("OBC", 23));

		for (Comparator_Practice_1 o : obj) {
			System.out.println(o);
		}
	}

}
