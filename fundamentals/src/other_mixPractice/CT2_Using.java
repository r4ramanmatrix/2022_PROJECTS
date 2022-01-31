package other_mixPractice;

import java.util.TreeSet;

public class CT2_Using {

	public static void main(String[] args) {
		TreeSet<CT2> ts = new TreeSet<CT2>(new CT2_Implementing());
		ts.add(new CT2("XS", "Delhi"));
		ts.add(new CT2("BXS", "New York"));
		ts.add(new CT2("ZXS", "Mumbai"));
		ts.add(new CT2("AXS", "Bangalore"));
		ts.add(new CT2("AXIS", "UK"));
		ts.add(new CT2("DELL", "US"));
		System.out.println("Sorting based on address:: ");
		for (CT2 c : ts) {
			System.out.println(c);
		}
	}

}
