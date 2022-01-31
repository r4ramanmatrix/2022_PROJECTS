package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class3 {

	private final String name;
	private final int age;
	List<String> friends;

	public Immutable_Class3(String s, int i, List<String> listing) {
		name = s;
		age = i;
		friends = new ArrayList<String>();
		for (String S : listing) {
			friends.add(S);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getList() {
		List<String> li = new ArrayList<>();
		for (String s : friends) {
			li.add(s);
		}
		return li;
	}

}
