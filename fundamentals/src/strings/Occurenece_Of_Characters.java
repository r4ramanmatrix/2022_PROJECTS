package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurenece_Of_Characters {

	public static void main(String[] args) {
		String name = "raman kumar";
		name = name.replaceAll("\\s+", "");
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (Character ch : name.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);
	}

}
