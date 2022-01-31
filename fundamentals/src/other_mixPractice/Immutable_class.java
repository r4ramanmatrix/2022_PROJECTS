package other_mixPractice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_class {

	private final String name;
	private final int age;
	private final List<String> hobby;

	public Immutable_class(String n, int a, List<String> h) {
		name = n;
		age = a;
		hobby = new ArrayList<String>();
		for (String s : h) {
			hobby.add(s);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getHobbies() {
		List<String> ho = new ArrayList<>();
		for (String s : hobby) {
			ho.add(s);
		}
		return ho;
	}

}
