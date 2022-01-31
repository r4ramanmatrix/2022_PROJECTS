package other_mixPractice;

public class LKG implements Comparable<LKG> {

	String k_name;
	int k_age;

	public LKG(String k_name, int k_age) {
		this.k_age = k_age;
		this.k_name = k_name;
	}

	public String toString() {
		return "Name is:: " + k_name + " Age is: " + k_age;
	}

	public int compareTo(LKG obj) {
		return obj.k_age-this.k_age;
	}

}
