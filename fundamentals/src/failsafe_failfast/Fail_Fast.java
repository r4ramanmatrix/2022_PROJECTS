package failsafe_failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fail_Fast {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(99);
		li.add(299);
		li.add(499);

		Iterator<Integer> itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			li.add(89);
		}

	}

}
