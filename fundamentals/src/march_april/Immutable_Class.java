package march_april;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class {

	private final String name;
	private final int age;
	private final List<String> hobby;

	public Immutable_Class(String s, int i, List<String> h) {
		name = s;
		age = i;
		hobby = new ArrayList<>();
		for (String S : h) {
			hobby.add(S);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getHobbies() {
		List<String> li = new ArrayList<>();
		for (String s1 : hobby) {
			li.add(s1);
		}
		return li;
	}

}
