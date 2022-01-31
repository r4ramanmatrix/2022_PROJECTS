package march_april_practice;

import java.util.Set;
import java.util.TreeSet;

public class Access_CP7 {

	public static void main(String[] args) {
		Set<CP7> ts = new TreeSet<CP7>();
		ts.add(new CP7("A", 25));
		ts.add(new CP7("X", 99));
		ts.add(new CP7("S", 102));
		ts.add(new CP7("P", 28));
		ts.add(new CP7("M", 58));

		for (CP7 o : ts) {
			System.out.println(o);
		}

	}

}
