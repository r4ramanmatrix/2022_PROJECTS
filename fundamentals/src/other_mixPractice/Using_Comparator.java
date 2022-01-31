package other_mixPractice;

import java.util.Comparator;

public class Using_Comparator implements Comparator<Office_Class> {

	public int compare(Office_Class obj1, Office_Class obj2) {
		return obj2.employee_id - obj1.employee_id;
	}
}
