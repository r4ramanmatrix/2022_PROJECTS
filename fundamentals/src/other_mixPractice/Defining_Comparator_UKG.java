package other_mixPractice;

import java.util.Comparator;

public class Defining_Comparator_UKG implements Comparator<UKG> {

	public int compare(UKG obj1, UKG obj2) {
		return obj1.sid - obj2.sid;
	}

}
