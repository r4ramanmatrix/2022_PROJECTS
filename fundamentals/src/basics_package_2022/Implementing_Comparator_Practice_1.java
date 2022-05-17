package basics_package_2022;

import java.util.Comparator;

public class Implementing_Comparator_Practice_1 implements Comparator<Comparator_Practice_1> {

	public int compare(Comparator_Practice_1 obj1, Comparator_Practice_1 obj2) {
		return obj1.age - obj2.age;
	}

}
