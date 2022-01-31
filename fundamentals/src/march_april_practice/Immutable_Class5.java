package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class5 {

	private final String name;
	private final int age;
	private final List<String> location;

	public Immutable_Class5(String s, int i, List<String> li) {
		name = s;
		age = i;
		location = new ArrayList<String>();
		for (String lo : li) {
			location.add(lo);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getList() {
		List<String> li = new ArrayList<String>();
		for (String s : location) {
			li.add(s);
		}
		return li;
	}

}
