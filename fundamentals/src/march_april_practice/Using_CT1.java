package march_april_practice;

import java.util.TreeSet;

public class Using_CT1 {
	
	public static void main(String[] args) {
		TreeSet<CT1> ts=new TreeSet<CT1>(new Implementing_Comparator());
		ts.add(new CT1("AXIS", 1993));
		ts.add(new CT1("SBI", 1955));
		ts.add(new CT1("CANARA", 1969));
		ts.add(new CT1("ICICI", 1994));
		ts.add(new CT1("KOTAk", 2003));
		
		for(CT1 obj:ts){
			System.out.println(obj);
		}
	}

}
