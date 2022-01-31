package other_mixPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Initializing_Office {

	public static void main(String[] args) {
		TreeSet<Office_Class> ts = new TreeSet<Office_Class>(new Using_Comparator());

		ts.add(new Office_Class(210, "ABX"));
		ts.add(new Office_Class(301, "DEMO"));
		ts.add(new Office_Class(102, "Text"));
		ts.add(new Office_Class(63, "Holla"));

		System.out.println("Customized sorting order:: ");
		for (Office_Class oc : ts) {
			System.out.println(oc.employee_id + " " + oc.employee_name);
		}

		String name = "Raman";
		System.out.println(name.hashCode());
		HashMap<String, Integer> maps = new HashMap<>();
		maps.put(name, 32);

		Set<Map.Entry<String, Integer>> mapSet = maps.entrySet();
		Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) mapSet.toArray()[0];
		System.out.println(e.getKey());
	}

}
