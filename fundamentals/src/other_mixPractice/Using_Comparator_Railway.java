package other_mixPractice;

import java.util.Comparator;

public class Using_Comparator_Railway implements Comparator<Railway_Staff> {

	public int compare(Railway_Staff obj1, Railway_Staff obj2) {
		return obj2.age - obj1.age;
	}

}
