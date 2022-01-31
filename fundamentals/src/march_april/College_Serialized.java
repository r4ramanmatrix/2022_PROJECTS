package march_april;

import java.io.Serializable;

public class College_Serialized implements Serializable{

	String studentName;
	int registrationNumber;

	public College_Serialized(String s, int i) {
		studentName = s;
		registrationNumber = i;
	}

	public String toString() {
		return "Name is: " + studentName + " Registration Number is:: " + registrationNumber;
	}

}
