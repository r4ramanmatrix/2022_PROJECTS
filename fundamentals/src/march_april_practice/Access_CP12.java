package march_april_practice;

import java.util.Set;
import java.util.TreeSet;

public class Access_CP12 {

	public static void main(String[] args) {
		Set<CP12> obj = new TreeSet<CP12>();
		obj.add(new CP12("ABC", "XYZ", 33, 14.50));
		obj.add(new CP12("XYZ", "ABC", 23, 18.50));
		obj.add(new CP12("RST", "XRZ", 93, 20.50));
		obj.add(new CP12("AWT", "XBZ", 83, 11.50));

		for (CP12 o : obj) {
			System.out.println(o);
		}
	}

}
