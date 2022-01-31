package march_april_practice;

import java.util.Comparator;

public class Implementing_Comparator1 implements Comparator<Ct2> {

	public int compare(Ct2 obj1, Ct2 obj2) {
		return obj2.eid - obj1.eid;
	}

}
