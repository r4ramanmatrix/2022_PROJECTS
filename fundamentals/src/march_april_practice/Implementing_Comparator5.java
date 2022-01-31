package march_april_practice;

import java.util.Comparator;

public class Implementing_Comparator5 implements Comparator<CT5> {

	public int compare(CT5 o1, CT5 o2) {
		return o1.isoNumber - o2.isoNumber;
	}

}
