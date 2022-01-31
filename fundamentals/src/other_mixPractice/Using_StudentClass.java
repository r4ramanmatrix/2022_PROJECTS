package other_mixPractice;

import java.util.TreeSet;

public class Using_StudentClass {

	public static void main(String[] args) {
		TreeSet<Student_Class> ts = new TreeSet<>();
		ts.add(new Student_Class(21, "Raman Kumar"));
		ts.add(new Student_Class(22, "Rama Kumar"));
		ts.add(new Student_Class(23, "Ram Kumar"));

		System.out.println("Natural sorting order:: ");
		for (Student_Class s : ts) {
			System.out.println(s.student_age + " " + s.student_name);
		}
	}

}
