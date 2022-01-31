package interview_questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurence_Of_characters {

	public static void main(String[] args) {
		String str = "seleniumjava";

		Map<Character, Integer> charMap = new LinkedHashMap<>();

		for (Character ch : str.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);
	}

}
