package other_mixPractice;

import java.util.TreeSet;

public class Using_LKG {

	public static void main(String[] args) {
		TreeSet<LKG> ts = new TreeSet<LKG>();

		ts.add(new LKG("System", 22));
		ts.add(new LKG("Time", 0));
		ts.add(new LKG("Laptop", 10));

		for (LKG l : ts) {
			System.out.println(l);
		}

	}

}
