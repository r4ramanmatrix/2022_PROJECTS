package march_april;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fail_Fast_2 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();

		al.add(22);
		al.add(32);
		al.add(42);
		al.add(52);
		al.add(82);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			
			if (itr.next() == 32) {
				itr.remove();
			}
		}
	}

}
