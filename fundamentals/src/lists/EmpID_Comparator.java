package lists;

import java.util.Comparator;

public class EmpID_Comparator implements Comparator<Implementing_Comparator> {

	@Override
	public int compare(Implementing_Comparator obj1, Implementing_Comparator obj2) {

		return obj1.getEmpId() - obj2.getEmpId();
	}

}
