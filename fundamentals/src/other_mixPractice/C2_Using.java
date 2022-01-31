package other_mixPractice;

import java.util.TreeSet;

public class C2_Using {

	public static void main(String[] args) {
		TreeSet<C2> ts = new TreeSet<C2>();
		ts.add(new C2("A", 2031));
		ts.add(new C2("X", 9131));
		ts.add(new C2("B", 11031));
		ts.add(new C2("C", 231));
		ts.add(new C2("Z", 1031));
		
		System.out.println("Sorting based on employee id:: ");
		for (C2 c : ts) {
			System.out.println(c);
		}

	}

}
