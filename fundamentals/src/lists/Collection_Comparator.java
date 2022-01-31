package lists;

import java.util.Comparator;

public class Collection_Comparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}

}
