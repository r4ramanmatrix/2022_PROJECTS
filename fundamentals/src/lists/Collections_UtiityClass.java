package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Collections_UtiityClass {
	
	public void m1() {
		
		List l=new ArrayList<>();
		l.add(171);
		l.add(191);
		l.add(141);
		l.add(151);
		l.add(161);
		l.add(121);
		l.add(181);
		l.add(131);
		//l.add(null);
		
		//System.out.println(l);
		System.out.println("This is unpredictable result if our list is not sorted: " + Collections.binarySearch(l, 171));
		ListIterator litr=l.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		Collections.sort(l);
		System.out.println("Ascending order sorted list:");
		System.out.println(l);
		System.out.println("Descending order sorted list:");
		Collections.sort(l, new Collection_Comparator());
		System.out.println(l);
		
		System.out.println("*********************************");
		
		ArrayList searching=new ArrayList<>(l);
		System.out.println(searching);
		
		System.out.println("My Target object at the index of: " + Collections.binarySearch(searching, 161));
		System.out.println(searching);
		System.out.println("My Target object at the index of: " + Collections.binarySearch(searching, 151, new Collection_Comparator()));
		System.out.println("My Target object at the index of: " + Collections.binarySearch(searching, 200));
		
		Collections.reverse(searching);
		System.out.println("Reversing the list: "+ searching);
	}

	
	public static void main(String[] args) {
		Collections_UtiityClass obj=new Collections_UtiityClass();
		obj.m1();

	}

}
