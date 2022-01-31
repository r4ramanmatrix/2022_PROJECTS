package march_april_practice;

import java.util.TreeSet;

public class Access_CP5 {

	public static void main(String[] args) {
		TreeSet<CP5> ts = new TreeSet<CP5>();
		ts.add(new CP5("X", 2));
		ts.add(new CP5("R", 20));
		ts.add(new CP5("A", 1));
		ts.add(new CP5("M", 15));
		ts.add(new CP5("A", 1));
		
		for(CP5 o:ts){
			System.out.println(o);
		}
	}

}
