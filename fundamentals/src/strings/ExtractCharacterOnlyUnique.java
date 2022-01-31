package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExtractCharacterOnlyUnique {

	public static void main(String[] args) {
		String str = "java selenium";

		char[] ch = str.toCharArray();

		Set<Character> sets = new LinkedHashSet<>();

		for (Character ch1 : ch) {
			sets.add(ch1);
		}

		StringBuilder sb = new StringBuilder();
		for (Character chx : sets) {
			sb.append(chx);
		}

		System.out.println(sb.toString());
	}

}
