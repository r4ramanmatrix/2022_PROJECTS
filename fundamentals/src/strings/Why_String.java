package strings;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Why_String {

	Hashtable<String, Integer> ht = new Hashtable<>();
	String str;
	String s1 = "KUMAR";

	public void m1() {
		ht.put("Raman", 31);
		ht.put("Gspann", 266);
		ht.put(s1, 30);
		s1.toLowerCase();
		System.out.println(ht.get("kumar"));

		Set<String> store = ht.keySet();

		Iterator<String> itr = store.iterator();

		while (itr.hasNext()) {
			str = itr.next();
			System.out.println("Key: " + str + " Value: " + ht.get(str));
		}
		Object obj = ht.get("KUMAR");
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Why_String objects = new Why_String();
		new Why_String().m1();

	}

}
