package march_april_practice;

import java.util.Set;
import java.util.TreeSet;

public class Access_CP10 {

	public static void main(String[] args) {
		Set<CP10> st = new TreeSet<CP10>();
		st.add(new CP10("AYO", 23));
		st.add(new CP10("XYO", 33));
		st.add(new CP10("ZYO", 44));
		st.add(new CP10("LYO", 21));
		st.add(new CP10("FYO", 20));
		st.add(new CP10("DYO", 19));

		for (CP10 o : st) {
			System.out.println(o);
		}
	}

}
