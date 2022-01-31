package march_april;

import java.io.Serializable;

public class Student_Serialized implements Serializable {

	String studentName;
	int studentRollno;

	public Student_Serialized(String s, int i) {
		studentName = s;
		studentRollno = i;
	}

	public String toString() {
		return "Name is:: " + studentName + " Roll no: " + studentRollno;
	}

}
