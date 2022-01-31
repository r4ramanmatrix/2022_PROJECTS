package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IterateHashMap {

	public static void main(String[] args) {
		Map<Integer, String> store = new HashMap<>();

		store.put(1, null);
		store.put(2, null);
		store.put(3, "Raman");
		store.put(4, "Kumar");
		store.put(0, "Hallo");
		store.put(0, "Hallo1");
		store.put(7, "Hallo2");
		store.put(5, "Hallo3");

		System.out.println(store.entrySet());

		System.out.println("Getting only Keys: ");

		for (Integer keyss : store.keySet()) {
			System.out.println(keyss);
		}
		for (String values : store.values()) {
			System.out.println(values);
		}

		for (Map.Entry<Integer, String> entry1 : store.entrySet()) {
			System.out.println(entry1.getKey() + " " + entry1.getValue());
		}

		Map<String, String> store1 = new TreeMap<>();
		store1.put("Name", "Raman");

		System.out.println(store1.entrySet());

	}

}
