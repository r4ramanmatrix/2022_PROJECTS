package march_april_practice;

import java.util.TreeSet;

public class Access_CT11 {

	public static void main(String[] args) {
		TreeSet<CT11> ts = new TreeSet<CT11>(new Implementing_Comparator11());
		ts.add(new CT11("R", "K", "r@gmail.com", 90000.0));
		ts.add(new CT11("V", "S", "vs@gmail.com", 78523.0));
		ts.add(new CT11("V", "C", "vc@gmail.com", 85023.36));
		ts.add(new CT11("P", "P", "p@gmail.com", 100000.500));
		ts.add(new CT11("X", "X", "x@gmail.com", 88235.56));

		for (CT11 obj1 : ts) {
			System.out.println(obj1);
		}
	}

}
