package interview_basic;

import java.util.ArrayList;

public class Practicing34 {

	public static void main(String[] args) {

		String s = new String("Aakash");
		String s1 = s;
		System.out.println(s == s1);
		String s2 = "Aakash";
		System.out.println(s1 == s2);
		String s3 = s.concat("Tyagi");
		System.out.println(s3);
		String s4 = s3;
		System.out.println(s4);
		System.out.println(s3 == s4);

		ArrayList<Integer> arraylist = new ArrayList<Integer>();

		arraylist.add(10010);
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(2);

		for (int i = 0; i < arraylist.size(); i++) {

			for (int j = arraylist.size() - 1; j > i; j--) {
				if (arraylist.get(i) > arraylist.get(j)) {

					int tmp = arraylist.get(i);
					arraylist.set(i, arraylist.get(j));
					arraylist.set(j, tmp);

				}

			}

		}
		for (int i : arraylist) {
			System.out.println(i);
		}
	}

}
