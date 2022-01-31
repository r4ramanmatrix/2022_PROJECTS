package march_april_practice;

import java.util.TreeSet;

public class Access_CP11 {

	public static void main(String[] args) {
		TreeSet<CP11> ts = new TreeSet<CP11>();
		ts.add(new CP11("R", "K", "r@gmail.com", 90000.0));
		ts.add(new CP11("V", "S", "vs@gmail.com", 78523.0));
		ts.add(new CP11("V", "C", "vc@gmail.com", 85023.36));
		ts.add(new CP11("P", "P", "p@gmail.com", 100000.500));
		ts.add(new CP11("X", "X", "x@gmail.com", 88235.56));

		for (CP11 obj : ts) {
			System.out.println(obj);
		}

	}

}
