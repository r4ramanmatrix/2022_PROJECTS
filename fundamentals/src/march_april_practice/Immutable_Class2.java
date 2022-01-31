package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Immutable_Class2 {

	private final String name;
	private final int age;
	private final List<String> games;

	public Immutable_Class2(String s, int a, List<String> li) {
		name = s;
		age = a;
		games = new ArrayList<String>();
		for (String S : li) {
			games.add(S);
		}
	}

	public String getName() {
		return name;
	}

	public int getage() {
		return age;
	}

	public List<String> getGamesList() {
		ArrayList<String> al = new ArrayList<>();
		for (String s : games) {
			al.add(s);
		}
		return al;
	}

}
