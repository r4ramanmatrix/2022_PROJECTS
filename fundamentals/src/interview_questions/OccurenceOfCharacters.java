package interview_questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfCharacters {

	public static void main(String[] args) {
		String str1 = "java";

		// Creating a HashMap containing char
		// as a key and occurrences as a value
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		// why i take LinkedHashMap here instead of HashMap is LinkedHashmap gives in
		// the given order {j=1, a=2, v=1}
		// whereas HashMap will give it randomly {a=2, v=1, j=1}

		// checking each char of str1.toCharArray()
		for (Character ch : str1.toCharArray()) {

			// so we have two condition here if that character is already present in a map
			// then we pick their previous value
			// and add one to them if it's in then we set character in their count is 1
			if (charMap.containsKey(ch)) {

				// If char is present in charMap,
				// incrementing it's count by 1
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				// If char is not present in charMap,
				// putting this char to charMap with 1 as it's value
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);
	}
}
