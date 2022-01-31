package march_april_practice;

import java.util.TreeSet;

public class Accessing_CP1 {

	public static void main(String[] args) {
		TreeSet<CP1> ts = new TreeSet<CP1>();
		ts.add(new CP1("AXIS", 102354));
		ts.add(new CP1("SBI", 2354));
		ts.add(new CP1("CANARA", 129354));
		ts.add(new CP1("ICICI", 1354));
		ts.add(new CP1("KOTAk", 92354));

		for (CP1 c : ts) {
			System.out.println(c);
		}

	}

}
