package march_april_practice;

import java.util.TreeSet;

public class Access_CT4 {

	public static void main(String[] args) {
		TreeSet<CT4> ts = new TreeSet<CT4>(new Implementing_Comparator4());
		ts.add(new CT4("Ra", 33));
		ts.add(new CT4("Vi", 33));
		ts.add(new CT4("Rah", 33));
		ts.add(new CT4("Kri", 35));
		ts.add(new CT4("Mo", 31));

		for (CT4 obj : ts) {
			System.out.println(obj);
		}

	}

}
