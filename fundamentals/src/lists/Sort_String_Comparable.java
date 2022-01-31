package lists;

public class Sort_String_Comparable implements Comparable<Sort_String_Comparable> {

	private String names;
	private int age;

	public Sort_String_Comparable(String names, int age) {
		this.names = names;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getString() {
		return names;
	}

	public void setString(String names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return names + "" + this.age;
	}

	/*
	 * @Override public int compareTo(Sort_String_Comparable otherString) { int
	 * compareInt = this.names.compareTo(otherString.names); if (compareInt < 0)
	 * return -1; if (compareInt > 0) return 1; return 0; }
	 */

	@Override
	public int compareTo(Sort_String_Comparable other) {
		if (this.age < other.age)
			return -1;
		if (this.age > other.age)
			return 1;
		return 0;
	}

}
