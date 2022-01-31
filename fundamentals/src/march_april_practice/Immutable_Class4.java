package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class4 {

	private final String name;
	private final int age;
	private final List<String> holidays;

	public Immutable_Class4(String s, int a, List<String> li) {
		name = s;
		age = a;
		holidays = new ArrayList<String>();
		for (String S : li) {
			holidays.add(S);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getListOfHolidays() {
		List<String> li = new ArrayList<>();
		for (String S : holidays) {
			li.add(S);
		}
		return li;
	}

}
