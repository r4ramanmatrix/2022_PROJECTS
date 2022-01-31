package march_april;

import java.util.TreeSet;

public class Using_CT1_Comparator {
	
	public static void main(String[] args) {
		TreeSet<CT1> ts = new TreeSet<CT1>(new Implementing_Comparatot());
		ts.add(new CT1("X", 200));
		ts.add(new CT1("C", 92));
		ts.add(new CT1("V", 12));
		ts.add(new CT1("M", 52));
		ts.add(new CT1("R", 23));

		for (CT1 obj1 : ts) {
			System.out.println(obj1);
		}
	}

}
