package other_mixPractice;

import java.util.Comparator;

public class Implementing_Comparator_Laptop implements Comparator<Laptop> {

	public int compare(Laptop l1, Laptop l2) {
		return l1.life - l2.life;
	}

}
