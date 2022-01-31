package set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetting {

	public void m1() {
		NavigableSet hset = new TreeSet<>(new Navigable_Comparator());
		hset.add(00.30);
		hset.add(01.30);
		hset.add(02.30);
		hset.add(03.30);
		hset.add(04.30);
		hset.add(05.30);
		hset.add(06.30);

		Iterator itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***************");
		System.out.println("Sorting in descending form: " + hset.descendingSet());
		System.out.println("Ceiling: " + hset.ceiling(03.30));
		System.out.println("Floor: " + hset.floor(03.30));
		System.out.println("Lower: " + hset.lower(03.30));
		System.out.println("higher: " + hset.higher(03.30));
		System.out.println("PollFirst: " + hset.pollFirst());
		System.out.println("PollLast: " + hset.pollLast());

		System.out.println(hset);
	}

	public static void main(String[] args) {
		NavigableSetting obj = new NavigableSetting();
		obj.m1();
	}

}
