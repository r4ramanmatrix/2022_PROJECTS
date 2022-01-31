package march_april_practice;

import java.util.Comparator;

public class Implementing_Comparator8 implements Comparator<CT8> {

	public int compare(CT8 obj1, CT8 obj2) {
		return (int) (obj2.packages - obj1.packages);
	}

}
