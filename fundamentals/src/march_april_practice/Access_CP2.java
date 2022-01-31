package march_april_practice;

import java.util.TreeSet;

public class Access_CP2 {

	public static void main(String[] args) {
		TreeSet<CP2> ts = new TreeSet<CP2>();
		ts.add(new CP2("this", 4));
		ts.add(new CP2("is", 2));
		ts.add(new CP2("teh", 3));
		ts.add(new CP2("string", 6));
		ts.add(new CP2("statement", 9));

		for (CP2 c : ts) {
			System.out.println(c);
		}
	}

}
