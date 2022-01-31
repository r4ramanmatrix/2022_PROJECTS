package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class10 {

	private final String name;
	private final int Age;
	private final List<String> games;

	public Immutable_Class10(String n, int i, List<String> lists) {
		name = n;
		Age = i;
		games = new ArrayList<>();
		for (String s : lists) {
			games.add(s);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return Age;
	}

	public List<String> getGamesList() {
		List<String> li = new ArrayList<>();
		for (String s : games) {
			li.add(s);
		}
		return li;
	}

}
