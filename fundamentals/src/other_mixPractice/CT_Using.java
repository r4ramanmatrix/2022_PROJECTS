package other_mixPractice;

import java.util.TreeSet;

public class CT_Using {

	public static void main(String[] args) {
		TreeSet<CT1> ts = new TreeSet<CT1>(new CT_Implementing());
		ts.add(new CT1("A", 12));
		ts.add(new CT1("X", 212));
		ts.add(new CT1("S", 312));
		ts.add(new CT1("P", 182));
		ts.add(new CT1("Z", 129));
		ts.add(new CT1("R", 127));

		for (CT1 c : ts) {
			System.out.println(c);
		}
	}

}
