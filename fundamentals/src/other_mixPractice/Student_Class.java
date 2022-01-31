package other_mixPractice;

public class Student_Class implements Comparable<Student_Class> {

	int student_age;
	String student_name;

	public Student_Class(int student_age, String student_name) {
		this.student_age = student_age;
		this.student_name = student_name;
	}

	public String toString() {
		return "student id:: " + student_age + " Student name:: " + student_name;
	}

	public int compareTo(Student_Class sc) {
		return this.student_name.compareTo(sc.student_name);
	}

}
