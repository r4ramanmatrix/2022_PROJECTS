package maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapping {

	public void m1() {
		HashMap<String, String> hmap = new HashMap<>();
		String Name1 = new String("Name");
		String Name2 = new String("Name");
		hmap.put(Name1, "Raman");
		hmap.put(Name2, "Sharma");
		hmap.put("Age", "30");
		hmap.put("Location", "West Sagar Pur");
		hmap.put("Name", "Aditya");

		for (Map.Entry ma : hmap.entrySet()) {
			System.out.println(ma.getKey() + " " + ma.getValue());
		}

		System.out.println(hmap.get("Age"));
		System.out.println(hmap.containsKey("Location"));
		// System.out.println(hmap.remove("Name"));

		System.out.println(hmap.containsValue("Aditya"));

		System.out.println(hmap.isEmpty());

		System.out.println(hmap.size());

		// hmap.clear();

		System.out.println(hmap.keySet());
		System.out.println(hmap.values());

		System.out.println(hmap.entrySet());

		hmap.put("Mobile", "9985964353");

		hmap.put(null, "Random");
		hmap.put(null, "random");
		hmap.put("", "Random");
		hmap.put("Sex", "Random");

		hmap.put(null, "AYO");
		hmap.put("Weather", null);
		System.out.println(hmap.entrySet());

		System.out.println(hmap.size());

		Set sets = hmap.entrySet();

		System.out.println(hmap);

		HashMap maps = new HashMap<>();
		maps.putAll(hmap);

		Set s = maps.keySet();
		System.out.println(s);

		Collection c = maps.values();
		System.out.println(c);

		Set s1 = maps.entrySet();
		System.out.println(s1);

		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public static void main(String[] args) {
		HashMapping obj = new HashMapping();
		obj.m1();

	}

}
