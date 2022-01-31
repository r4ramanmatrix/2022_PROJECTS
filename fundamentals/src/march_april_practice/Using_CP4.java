package march_april_practice;

import java.util.TreeSet;

public class Using_CP4 {

	public static void main(String[] args) {
		TreeSet<CP4> ts = new TreeSet<CP4>();
		ts.add(new CP4("Raman", 33));
		ts.add(new CP4("Raan", 32));
		ts.add(new CP4("Ram", 34));
		ts.add(new CP4("RamanKumar", 35));
		ts.add(new CP4("Rman", 37));

		for (CP4 obj1 : ts) {
			System.out.println(obj1);
		}
	}

}
