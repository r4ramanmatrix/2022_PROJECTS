package strings;

import java.util.ArrayList;
import java.util.List;

public final class Check_Immute {

	private final List<String> hobby;
	private final int age;
	private final String name;

	public Check_Immute(int age, String name, List<String> hobbies) {
		this.age = age;
		this.name = name;
		this.hobby = new ArrayList<>();
		for (String hobs : hobbies) {
			hobby.add(hobs);
		}
	}

	public String getter() {
		return name;
	}

	public int getterAge() {
		return age;
	}

	public List<String> getHobby() {
		List<String> li = new ArrayList<>();
		for (String s : hobby) {
			li.add(s);
		}
		return li;
	}

	public static void main(String[] args) {

	}

}
