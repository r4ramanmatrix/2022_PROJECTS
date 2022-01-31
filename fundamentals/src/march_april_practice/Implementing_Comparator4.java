package march_april_practice;

import java.util.Comparator;

public class Implementing_Comparator4 implements Comparator<CT4> {

	public int compare(CT4 obj1, CT4 obj2) {
		return obj2.name.compareTo(obj1.name);
	}

}
