package march_april_practice;

import java.util.TreeSet;

public class Implements_CP6 {

	public static void main(String[] args) {
		TreeSet<CP6> ts = new TreeSet<CP6>();
		ts.add(new CP6("A", 29));
		ts.add(new CP6("X", 33));
		ts.add(new CP6("F", 31));
		ts.add(new CP6("C", 28));
		ts.add(new CP6("K", 35));
		
		for(CP6 o:ts){
			System.out.println(o);
		}

	}

}
