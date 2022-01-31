package other_mixPractice;

import java.util.TreeSet;

public class Defining_UKG {

	public static void main(String[] args) {
		TreeSet<UKG> ts = new TreeSet<>(new Defining_Comparator_UKG());

		ts.add(new UKG("A", 201, 5.5));
		ts.add(new UKG("B", 215, 8.3));
		ts.add(new UKG("D", 501, 4.5));
		ts.add(new UKG("C", 615, 6.3));
		ts.add(new UKG("R", 301, 5.5));
		ts.add(new UKG("X", 295, 7.3));
		
		for(UKG u:ts){
			System.out.println(u);
		}
	}

}
