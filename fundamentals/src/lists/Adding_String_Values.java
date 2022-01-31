package lists;

import java.util.ArrayList;
import java.util.Collections;

public class Adding_String_Values {

	public static void main(String[] args) {
		ArrayList<Sort_String_Comparable> lists = new ArrayList<Sort_String_Comparable>();
		lists.add(new Sort_String_Comparable("Raman", 31));
		lists.add(new Sort_String_Comparable("Kumar", 29));
		lists.add(new Sort_String_Comparable("Sharma", 30));
		System.out.println("Before sorting: ");
		for (Sort_String_Comparable obj : lists) {
			System.out.println(obj);
		}

		Collections.sort(lists);
		System.out.println("After sorting: ");
		for (Sort_String_Comparable obj : lists) {
			System.out.println(obj);
		}
	}

}
