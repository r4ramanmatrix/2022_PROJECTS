package march_april_practice;

import java.util.TreeSet;

public class Access_CT9 {

	public static void main(String[] args) {
		TreeSet<CT9> ts = new TreeSet<CT9>(new Implmenting_CT9());
		ts.add(new CT9("SA", 77));
		ts.add(new CT9("SAM", 67));
		ts.add(new CT9("RSA", 97));
		ts.add(new CT9("ASR", 17));
		ts.add(new CT9("A", 07));
		ts.add(new CT9("RA", 71));
		
		for(CT9 o:ts){
			System.out.println(o);
		}

	}

}
