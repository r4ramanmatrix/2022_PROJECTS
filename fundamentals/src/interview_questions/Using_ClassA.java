package interview_questions;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Using_ClassA {

	public static void main(String[] args) {
		ClassA obj1 = new ClassA();
		ClassA obj2 = new ClassA();

		System.out.print(obj1.equals(obj2) + "\n");
		LinkedList list = new LinkedList();

		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));

		Iterator i = list.iterator();
		Collections.reverse(list);
		Collections.sort(list);
		while (i.hasNext()) {
			System.out.println(i.next() + " ");
		}

	}

}
