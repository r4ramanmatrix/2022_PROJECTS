package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class {

	private final String name;
	private final int age;
	private final List<Integer> id;

	public Immutable_Class(String n, int i, List<Integer> l) {
		name = n;
		age = i;
		id = new ArrayList<Integer>();
		for (int ie : l) {
			id.add(ie);
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<Integer> getId() {
		List<Integer> li = new ArrayList<>();
		for (int i : id) {
			li.add(i);
		}
		return li;
	}

}
