package march_april;

import java.util.TreeSet;

public class Using_CL1 {

	public static void main(String[] args) {
		TreeSet<CL1> ts = new TreeSet<CL1>();
		ts.add(new CL1("X", 200));
		ts.add(new CL1("C", 92));
		ts.add(new CL1("V", 12));
		ts.add(new CL1("M", 52));
		ts.add(new CL1("R", 23));

		for (CL1 obj1 : ts) {
			System.out.println(obj1);
		}

	}

}
