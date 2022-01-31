package march_april_practice;

import java.util.Comparator;

public class Implementing_CT10 implements Comparator<CT10> {

	public int compare(CT10 obj1, CT10 obj2) {
		return obj1.pin - obj2.pin;
	}

}
