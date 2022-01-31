package other_mixPractice;

import java.util.Comparator;

public class Using_Comparator_Hotel implements Comparator<Hotel_Staff> {

	public int compare(Hotel_Staff obj1, Hotel_Staff obj2) {
		return obj2.emp_age - obj1.emp_age;
	}

}
