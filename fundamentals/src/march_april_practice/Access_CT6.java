package march_april_practice;

import java.util.TreeSet;

public class Access_CT6 {

	public static void main(String[] args) {
		TreeSet<CT6> ts = new TreeSet<CT6>(new Implementing_Comparator6());
		ts.add(new CT6("A", 29));
		ts.add(new CT6("X", 33));
		ts.add(new CT6("F", 31));
		ts.add(new CT6("C", 28));
		ts.add(new CT6("K", 35));
		
		for(CT6 o:ts){
			System.out.println(o);
		}
		
		
	}

}
