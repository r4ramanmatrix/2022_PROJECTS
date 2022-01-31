package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Immutable_Class11 {

	final String name;
	final int age;
	final List<String> allHobbies;

	public Immutable_Class11(String s, int i, List<String> li) {
		name = s;
		age = i;
		allHobbies = new ArrayList<String>();
		for (String S1 : li) {
			allHobbies.add(S1);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getAllHobby() {
		List<String> l = new ArrayList<>();
		for (String s : allHobbies) {
			l.add(s);
		}
		return l;
	}

}
