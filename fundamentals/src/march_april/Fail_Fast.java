package march_april;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fail_Fast {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("A");
		li.add("X");
		li.add("J");
		li.add("K");
		li.add("F");

		Iterator<String> itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			// Fail Fast here will throw Exception: ConcurrentModificationException
			li.add("Raman");
			
			
		}

	}

}
