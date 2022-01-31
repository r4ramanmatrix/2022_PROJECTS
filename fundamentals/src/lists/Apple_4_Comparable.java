package lists;

public class Apple_4_Comparable implements Comparable<Apple_4_Comparable> {

	String variety;
	int weight;

	public Apple_4_Comparable(int weight, String variety) {
		this.weight = weight;
		this.variety = variety;

	}

	@Override
	public String toString() {
		return this.weight + " " + this.variety;
	}

	@Override
	public int compareTo(Apple_4_Comparable other) {

		if (weight == other.weight) {
			return 0;
		}
		if (weight > other.weight) {
			return 1;
		} else {
			return -1;
		}
	}

}
