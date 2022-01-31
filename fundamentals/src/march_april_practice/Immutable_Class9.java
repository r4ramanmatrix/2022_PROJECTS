package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public final class Immutable_Class9 {

	final String name;
	final int eid;

	final List<String> places;

	public Immutable_Class9(String s, int i, List<String> li) {
		name = s;
		eid = i;
		places = new ArrayList<String>();
		for (String l : li) {
			places.add(l);
		}
	}

	public String getName() {
		return name;
	}

	public int getEid() {
		return eid;
	}

	public List<String> getPlaces() {
		List<String> li = new ArrayList<>();
		for (String s : places) {
			li.add(s);
		}
		return li;
	}

}
