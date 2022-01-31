package march_april_practice;

import java.util.Set;
import java.util.TreeSet;

public class Access_CT7 {

	public static void main(String[] args) {
		Set<CT7> ts = new TreeSet<CT7>(new Implementing_CT7());
		ts.add(new CT7("X", 5.5));
		ts.add(new CT7("J", 6.6));
		ts.add(new CT7("C", 4.5));
		ts.add(new CT7("P", 7.7));
		ts.add(new CT7("R", 18.5));
		ts.add(new CT7("Y", 9.0));

		for (CT7 o : ts) {
			System.out.println(o);
		}
	}

}
