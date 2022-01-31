package march_april_practice;

import java.util.TreeSet;

public class Using_CP3 {

	public static void main(String[] args) {
		TreeSet<CP3> ts = new TreeSet<CP3>();
		ts.add(new CP3("Raman", 33));
		ts.add(new CP3("Ramankumar", 32));
		ts.add(new CP3("Rama", 23));
		ts.add(new CP3("Aman", 31));

		for (CP3 obj : ts) {
			System.out.println(obj);
		}
	}

}
