package march_april_practice;

import java.util.Set;
import java.util.TreeSet;

public class Access_CT10 {

	public static void main(String[] args) {
		Set<CT10> sets = new TreeSet<CT10>(new Implementing_CT10());
		sets.add(new CT10("Nangal", 110046));
		sets.add(new CT10("JanakPuri", 110058));
		sets.add(new CT10("Patel Nagar", 110008));
		sets.add(new CT10("Uttam Nagar", 110059));
		sets.add(new CT10("Karol Bagh", 110005));

		for (CT10 obj : sets) {
			System.out.println(obj);
		}
	}

}
