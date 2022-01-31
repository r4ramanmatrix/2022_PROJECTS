package other_mixPractice;

import java.util.TreeSet;

public class C1_Using {

	public static void main(String[] args) {
		TreeSet<C1> ts = new TreeSet<C1>();
		ts.add(new C1("A", 2));
		ts.add(new C1("X", 92));
		ts.add(new C1("Z", 23));
		ts.add(new C1("R", 42));
		ts.add(new C1("T", 28));
		ts.add(new C1("P", 29));

		for (C1 c : ts) {
			System.out.println(c.toString());
		}

	}

}
