package march_april_practice;

import java.util.TreeSet;

public class Access_CT5 {

	public static void main(String[] args) {
		TreeSet<CT5> ts = new TreeSet<CT5>(new Implementing_Comparator5());
		ts.add(new CT5("Suffola", 852364791));
		ts.add(new CT5("Aimil", 741258963));
		ts.add(new CT5("Dabur", 987456321));
		ts.add(new CT5("Parle", 147523698));
		ts.add(new CT5("Britania", 668974512));

		for (CT5 o : ts) {
			System.out.println(o);
		}

	}

}
