package march_april_practice;

import java.util.Comparator;

public class Implementing_CT3 implements Comparator<CT3> {

	public int compare(CT3 obj1, CT3 obj2) {
		return obj2.name.compareTo(obj1.name);
	}

}
