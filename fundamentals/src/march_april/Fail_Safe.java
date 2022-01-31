package march_april;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Safe {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();

		al.add(22);
		al.add(32);
		al.add(42);
		al.add(52);
		al.add(82);

		CopyOnWriteArrayList<Integer> copied = new CopyOnWriteArrayList<>(al);
		Iterator<Integer> itr=copied.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			copied.add(11);
			
		}
		
		System.out.println(copied);
	}

}
