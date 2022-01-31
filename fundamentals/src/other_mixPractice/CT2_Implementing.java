package other_mixPractice;

import java.util.Comparator;

public class CT2_Implementing implements Comparator<CT2> {

	public int compare(CT2 obj1, CT2 obj2) {
		return obj1.saddress.compareTo(obj2.saddress);
	}

}
