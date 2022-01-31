package march_april_practice;

import java.util.Comparator;

public class Implementing_CT7 implements Comparator<CT7> {

	public int compare(CT7 obj1, CT7 obj2) {
		return (int) (obj2.height - obj1.height);
	}

}
