package other_mixPractice;

public class College_Class implements Comparable<College_Class> {

	String s_name;
	int s_age;

	public College_Class(String s_name, int s_age) {
		this.s_name = s_name;
		this.s_age = s_age;
	}

	public String toString() {
		return "Student age:: " + s_age + " Student Name:: " + s_name;
	}

	public int compareTo(College_Class c) {
		return this.s_name.compareTo(c.s_name);
	}

}
