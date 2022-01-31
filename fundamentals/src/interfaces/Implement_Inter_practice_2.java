package interfaces;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import abstractClassed.Abstracting_Practice;

public class Implement_Inter_practice_2 extends Abstracting_Practice implements Inter_practice, Inter_practice2 {

	@Override
	public void m1() {
		System.out.println(" This is the common method");
	}

	@Override
	public void m2() {
		System.out.println("This is abstract class override method");
	}

	public static void main(String[] args) {
		Inter_practice obj = new Implement_Inter_practice_2();
		obj.m1();
		Abstracting_Practice obj1 = new Implement_Inter_practice_2();
		obj1.m2();
		System.out.println(obj1.a);

		String str = "raman kumar";
		str = str.replaceAll("\\s+", "");
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (Character ch : str.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);

		Set<String> sets = new HashSet<>();

		obj.li.add("Raman");
		System.out.println(li);

	}

}
