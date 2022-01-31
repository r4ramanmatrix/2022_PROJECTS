package march_april_practice;

import java.util.TreeSet;

public class Using_CT3 {

	public static void main(String[] args) {
		TreeSet<CT3> ts = new TreeSet<CT3>(new Implementing_CT3());
		ts.add(new CT3("Raman", 33));
		ts.add(new CT3("Ramankumar", 32));
		ts.add(new CT3("Rama", 23));
		ts.add(new CT3("Aman", 31));
		ts.add(new CT3("Zebra", 20));

		for (CT3 o : ts) {
			System.out.println(o);
		}
	}

}
