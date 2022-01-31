package other_mixPractice;

public class Airport_Staff implements Comparable<Airport_Staff> {

	String e_name;
	int e_id;

	public Airport_Staff(String e_name, int e_id) {
		this.e_id = e_id;
		this.e_name = e_name;
	}

	public String toString() {
		return "Employee Name:: " + e_name + " Employee id: " + e_id;
	}

	public int compareTo(Airport_Staff as) {
		if (this.e_id > as.e_id) {
			return 1;
		} else if (this.e_id < as.e_id) {
			return -1;
		} else {
			return 0;
		}

	}

}
