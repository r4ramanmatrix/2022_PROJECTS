package other_mixPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Using_Airport {

	public static void main(String[] args) {
		Set<Airport_Staff> iSet = new HashSet<Airport_Staff>();
		iSet.add(new Airport_Staff("ABX", 211));
		iSet.add(new Airport_Staff("DXC", 101));
		iSet.add(new Airport_Staff("GHJ", 601));
		iSet.add(new Airport_Staff("DXY", 11));
		iSet.add(new Airport_Staff("CDX", 991));

		TreeSet<Airport_Staff> ts = new TreeSet<>(iSet);
		
		for (Airport_Staff as : ts) {
			System.out.println(as);
		}
	}

}
