package lists;

import java.util.ArrayList;
import java.util.Collections;

public class Using_Practice_Comparator_And_Comparator_practice {

	public static void main(String[] args) {
		ArrayList<Practice_Comparator> lists = new ArrayList<>();
		lists.add(new Practice_Comparator("Raman", 266, 50000));
		lists.add(new Practice_Comparator("Mohit", 264, 55000));
		lists.add(new Practice_Comparator("Vikram", 98, 86000));
		lists.add(new Practice_Comparator("Ravi", 002, 106000));
		lists.add(new Practice_Comparator("Parveen", 828, 105000));

		for (Practice_Comparator obj : lists) {
			System.out.println(obj);
		}

		Collections.sort(lists, new Comparator_practice());

		System.out.println("***********");

		for (Practice_Comparator obj : lists) {
			System.out.println(obj);
		}
	}

}
