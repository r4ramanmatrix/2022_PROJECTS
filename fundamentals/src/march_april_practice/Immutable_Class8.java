package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class8 {

	final String name;
	final int age;
	final List<String> li;

	public Immutable_Class8(String s, int i, List<String> l) {
		name = s;
		age = i;
		li = new ArrayList<String>();
		for (String str : l) {
			li.add(str);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getList() {
		List<String> lis = new ArrayList<>();
		for (String s : li) {
			lis.add(s);
		}
		return lis;
	}
}
