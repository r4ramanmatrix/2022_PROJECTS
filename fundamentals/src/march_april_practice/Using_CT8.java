package march_april_practice;

import java.util.TreeSet;

public class Using_CT8 {
	
	public static void main(String[] args) {
		TreeSet<CT8> ts=new TreeSet<CT8>(new Implementing_Comparator8());
		ts.add(new CT8("X", 12.5));
		ts.add(new CT8("S", 13.5));
		ts.add(new CT8("D", 15.5));
		ts.add(new CT8("P", 5.7));
		ts.add(new CT8("F", 16.8));
		ts.add(new CT8("U", 7.0));
		
		for(CT8 O:ts){
			System.out.println(O);
		}
		
	}

}
