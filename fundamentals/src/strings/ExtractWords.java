package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExtractWords {

	public static void main(String[] args) {
		String str = "Hello java selenium Java Selenium World Hello";
		String[] spl = str.split(" ");
		Set<String> sets = new LinkedHashSet<>();
		for (String s : spl) {
			sets.add(s);
		}
		System.out.println(sets);
	}

}
