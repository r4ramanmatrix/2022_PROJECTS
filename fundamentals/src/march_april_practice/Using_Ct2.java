package march_april_practice;

import java.util.TreeSet;

public class Using_Ct2 {

	public static void main(String[] args) {
		TreeSet<Ct2> ts = new TreeSet<Ct2>(new Implementing_Comparator1());
		ts.add(new Ct2("AXIS", 102354));
		ts.add(new Ct2("SBI", 2354));
		ts.add(new Ct2("CANARA", 129354));
		ts.add(new Ct2("ICICI", 1354));
		ts.add(new Ct2("KOTAk", 92354));

		for (Ct2 obj : ts) {
			System.out.println(obj);
		}
	}

}
