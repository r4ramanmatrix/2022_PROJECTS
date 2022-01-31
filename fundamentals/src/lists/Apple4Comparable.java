package lists;

import java.util.ArrayList;
import java.util.Collections;

public class Apple4Comparable {

	public static void main(String[] args) {
		ArrayList<Apple_4_Comparable> lists = new ArrayList<>();
		lists.add(new Apple_4_Comparable(12, "BRAEBURN"));
		lists.add(new Apple_4_Comparable(5, "FUJI"));
		lists.add(new Apple_4_Comparable(8, "CAMEO"));

		for (Apple_4_Comparable obj : lists) {
			System.out.println(obj);
		}

		Collections.sort(lists);
		System.out.println("*************");

		for (Apple_4_Comparable obj : lists) {
			System.out.println(obj);
		}
	}

}
