package lists;

import java.util.ArrayList;

public class ArrayList_Sortin {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(99);
		al.add(19);
		al.add(201);
		int temp = 0;
		for (int i = 0; i < al.size(); i++) {
			for (int j = al.size() - 1; j > i; j--) {
				if (al.get(i) > al.get(j)) {
					temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}

		System.out.println("Sorted list is: ");
		for (int a : al) {
			System.out.println(a);
		}
	}

}
