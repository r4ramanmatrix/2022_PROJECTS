package march_april_practice;

import java.util.TreeSet;

public class Access_CP9 {

	public static void main(String[] args) {
		TreeSet<CP9> ts = new TreeSet<CP9>();
		ts.add(new CP9("X", 22));
		ts.add(new CP9("A", 12));
		ts.add(new CP9("C", 32));
		ts.add(new CP9("P", 28));
		ts.add(new CP9("R", 33));
		
		for(CP9 o:ts){
			System.out.println(o);
		}
	}

}
