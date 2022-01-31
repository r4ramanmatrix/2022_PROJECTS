package lists;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Sorting2 {
	
	public static void main(String[] args) {
		ArrayList<Comparable_Sorting1> lists=new ArrayList<>();
		lists.add(new Comparable_Sorting1("Raman", 31));
		lists.add(new Comparable_Sorting1("Mohit", 30));
		lists.add(new Comparable_Sorting1("Vikas", 32));
		
		for(Comparable_Sorting1 s1:lists){
			System.out.println(s1);
		}
		
		Collections.sort(lists);
		
		System.out.println("*****Sorting on Age****");
		
		for(Object o:lists){
			System.out.println(o);
		}
	}

}
