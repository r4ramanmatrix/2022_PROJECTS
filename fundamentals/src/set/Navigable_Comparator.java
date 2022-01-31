package set;

import java.util.Comparator;

public class Navigable_Comparator implements Comparator {

	
	public int compare(Object o1, Object o2) {
		Double d1=(Double)o1;
		Double d2=(Double)o2;
		return d1.compareTo(d2);
	}

}
