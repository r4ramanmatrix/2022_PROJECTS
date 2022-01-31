package collection_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection_to_array {

	public static void main(String[] args) {
		Collection<Integer> store = new ArrayList<Integer>();

		store.add(1);
		store.add(10);
		store.add(2);

		for (int n : store) {
			System.out.println(n);
		}

		Object[] i = store.toArray();
		for (Object n : i) {
			System.out.println(n);
		}
		// System.out.println(Collections.sort(store));
		String statement = "this is the string statement";
		List<String> li = new ArrayList<>(Arrays.asList(statement.split(" ")));

		for (String s : li) {
			System.out.println(s);
			if (s.contains("this") == true) {
				System.out.println("Present");
				break;
			} else {
				System.out.println("Not Present");
			}
		}
		Collections.sort(li);
		System.out.println(li);
		int index = Collections.binarySearch(li, "string");
		System.out.println("text is on " + index + " position.");
		Collections.shuffle(li);
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the integer: ");
		int next = scan.nextInt();
		System.out.println("Entered integer is: " + next);

	}

}
