package other_mixPractice;

import java.util.TreeSet;

public class Using_Railway {

	public static void main(String[] args) {
		TreeSet<Railway_Staff> iSet = new TreeSet<Railway_Staff>(new Using_Comparator_Railway());
		iSet.add(new Railway_Staff(32, "Raman"));
		iSet.add(new Railway_Staff(20, "Anything"));
		iSet.add(new Railway_Staff(30, "nything"));
		iSet.add(new Railway_Staff(99, "ything"));
		iSet.add(new Railway_Staff(82, "thing"));

		for (Railway_Staff rs : iSet) {
			System.out.println(rs);
		}

	}

}
