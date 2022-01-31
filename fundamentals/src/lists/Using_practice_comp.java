package lists;

import java.util.ArrayList;
import java.util.Collections;

public class Using_practice_comp {

	public static void main(String[] args) {
		ArrayList<Practice_comparable> al = new ArrayList<>();
		al.add(new Practice_comparable("Raman", 266));
		al.add(new Practice_comparable("Mohit", 264));
		al.add(new Practice_comparable("Ravi", 002));
		al.add(new Practice_comparable("Vikram", 98));
		al.add(new Practice_comparable("Aakash", 90));

		for (Practice_comparable obj : al) {
			System.out.println(obj);
		}

		Collections.sort(al);
		System.out.println("****************");

		for (Practice_comparable obj : al) {
			System.out.println(obj);
		}
	}

}
