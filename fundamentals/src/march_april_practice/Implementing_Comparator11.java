package march_april_practice;

import java.util.Comparator;

public class Implementing_Comparator11 implements Comparator<CT11> {

	public int compare(CT11 obj1, CT11 obj2) {
		return (int) (obj1.salary - obj2.salary);
	}

}
