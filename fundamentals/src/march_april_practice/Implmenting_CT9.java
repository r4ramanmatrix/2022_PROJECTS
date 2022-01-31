package march_april_practice;

import java.util.Comparator;

public class Implmenting_CT9 implements Comparator<CT9> {

	public int compare(CT9 obj1, CT9 obj2) {
		return obj1.name.compareTo(obj2.name);
	}

}
