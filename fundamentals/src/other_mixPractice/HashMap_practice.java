package other_mixPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_practice {

	String name = "Raman";

	public static void main(String[] args) {
		System.out.println(new HashMap_practice().name.hashCode());
		int hashValue = new HashMap_practice().name.hashCode();
		System.out.println(hashValue & (16 - 1));
		System.out.println(hashValue & 15);

		Map<String, Integer> iMap = new HashMap<>(16);
		Map<String, Integer> iMap2 = new HashMap<>(16, 0.50f);

		System.out.println("Size of the map:: " + iMap.size());

		iMap.put(new HashMap_practice().name, 78726315);
		System.out.println("Size of the map:: " + iMap.size());
		System.out.println(iMap);
		
		

		Set<Map.Entry<String, Integer>> eset = iMap.entrySet();
		for (Map.Entry<String, Integer> mapEnt : eset) {
			System.out.println("KEY:: " + mapEnt.getKey() + " ==== " + "VALUE:: " + mapEnt.getValue());
		}
	}

}
