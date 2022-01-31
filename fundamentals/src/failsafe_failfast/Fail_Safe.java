package failsafe_failfast;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Safe {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> copyAL = new CopyOnWriteArrayList<>();
		copyAL.add(789);
		copyAL.add(189);
		copyAL.add(689);
		copyAL.add(989);

		Iterator<Integer> itr = copyAL.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			copyAL.add(8999);
		}
		System.out.println(copyAL);
	}

}
