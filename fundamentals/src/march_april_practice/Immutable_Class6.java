package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class6 {

	private final String name;
	private final int age;
	private final List<String> fruitsName;

	public Immutable_Class6(String s, int i, List<String> li) {
		name = s;
		age = i;
		fruitsName = new ArrayList<>();
		for (String S : li) {
			fruitsName.add(S);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getFruits() {
		List<String> li = new ArrayList<>();
		for (String s : fruitsName) {
			li.add(s);
		}
		return li;
	}

}
