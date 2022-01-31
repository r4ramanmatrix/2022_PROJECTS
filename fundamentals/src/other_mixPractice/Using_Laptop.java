package other_mixPractice;

import java.util.TreeSet;

public class Using_Laptop {

	public static void main(String[] args) {
		TreeSet<Laptop> ts = new TreeSet<Laptop>(new Implementing_Comparator_Laptop());
		ts.add(new Laptop("Dell", 10, 147852369));
		ts.add(new Laptop("Lenovo", 11, 369852147));
		ts.add(new Laptop("Fujitsu", 8, 258741369));
		ts.add(new Laptop("Vaio", 5, 852147963));
		ts.add(new Laptop("Samsung", 7, 963258741));
		ts.add(new Laptop("HP", 9, 789654123));
		ts.add(new Laptop("Mi", 2, 321456987));

		for (Laptop l : ts) {
			System.out.println(l);
		}
	}

}
