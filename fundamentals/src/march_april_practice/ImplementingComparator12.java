package march_april_practice;

import java.util.Comparator;

public class ImplementingComparator12 implements Comparator<CT12> {

	public int compare(CT12 obj1, CT12 obj2) {
		return obj1.city.compareTo(obj2.city);
	}

}
