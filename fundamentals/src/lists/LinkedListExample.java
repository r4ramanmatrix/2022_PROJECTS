package lists;

import java.util.LinkedList;
import java.util.ListIterator;

import org.w3c.dom.Node;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		li.add(96);
		li.add(1);
		li.add(88);
		li.add(101);

		// System.out.println(li.indexOf(1));

		ListIterator itr = (ListIterator) li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public void prepend(Object data) {
		
	}

}
