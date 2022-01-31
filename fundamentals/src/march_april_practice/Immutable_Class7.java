package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class7 {

	final String name;
	final int age;
	final List<String> language;

	public Immutable_Class7(String s, int i, List<String> li) {
		name = s;
		age = i;
		language = new ArrayList<>();
		for (String S : li) {
			language.add(S);
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
		for (String s : language) {
			li.add(s);
		}
		return li;
	}

}
