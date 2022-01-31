package other_mixPractice;

import java.util.TreeSet;

public class College_Implementing {

	public static void main(String[] args) {
		TreeSet<College_Class> ts = new TreeSet<>();
		ts.add(new College_Class("Raman", 20));
		ts.add(new College_Class("Ram", 30));
		ts.add(new College_Class("Rama", 40));
		ts.add(new College_Class("Ramana", 50));
		ts.add(new College_Class("Ramankumar", 60));
		
		for(College_Class ci:ts){
			System.out.println(ci);
		}
	}

}
