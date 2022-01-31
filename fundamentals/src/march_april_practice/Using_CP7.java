package march_april_practice;

import java.util.TreeSet;

public class Using_CP7 {

	public static void main(String[] args) {
		TreeSet<CP8> ts = new TreeSet<CP8>();
		ts.add(new CP8("X", 255));
		ts.add(new CP8("Z", 55));
		ts.add(new CP8("S", 1255));
		ts.add(new CP8("H", 2555));
		ts.add(new CP8("P", 25885));
		ts.add(new CP8("A", 25));
		
		for(CP8 o:ts){
			System.out.println(o);
		}

	}

}
