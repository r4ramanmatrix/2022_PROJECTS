package march_april_practice;

import java.util.Set;
import java.util.TreeSet;

public class Access_CT12 {

	public static void main(String[] args) {
		Set<CT12> obj = new TreeSet<CT12>(new ImplementingComparator12());
		obj.add(new CT12("ABC", 2361, "NEW YORK"));
		obj.add(new CT12("DEMO", 3236, "NEW DELHI"));
		obj.add(new CT12("OLA", 2356, "NEW JERSEY"));
		obj.add(new CT12("UBER", 2366, "NEW MUMBAI"));

		for (CT12 o : obj) {
			System.out.println(o);
		}

	}

}
