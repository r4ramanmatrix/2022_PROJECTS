package lists;

import java.util.Comparator;

public class Comparator_practice implements Comparator<Practice_Comparator> {

	@Override
	public int compare(Practice_Comparator obj1, Practice_Comparator obj2) {
		return obj1.getEmpId() - obj2.getEmpId();
	}

}
