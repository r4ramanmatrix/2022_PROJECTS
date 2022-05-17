package basics_package_2022;

import java.util.Set;
import java.util.TreeSet;

public class Access_Comparable_Practice_1 {

	public static void main(String[] args) {
		Set<Comparable_Practice_1> obj = new TreeSet<Comparable_Practice_1>();
		obj.add(new Comparable_Practice_1("Employee21", 5236));
		obj.add(new Comparable_Practice_1("Employee221", 5826));
		obj.add(new Comparable_Practice_1("Employee121", 3526));
		obj.add(new Comparable_Practice_1("Employee921", 526));
		obj.add(new Comparable_Practice_1("Employee321", 1526));
		obj.add(new Comparable_Practice_1("Employee71", 5226));

		for (Comparable_Practice_1 o : obj) {
			System.out.println(o);
		}
	}

}
