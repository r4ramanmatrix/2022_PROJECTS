package march_april;

import java.util.Comparator;

public class Implementing_Comparatot implements Comparator<CT1> {

	public int compare(CT1 obj1, CT1 obj2) {
		return obj2.name.compareTo(obj1.name);
	}

}
