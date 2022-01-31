package other_mixPractice;

public class Visa_Applicant implements Comparable<Visa_Applicant> {

	String a_name;
	int a_age;
	String County;

	public Visa_Applicant(String a_name, int a_age, String Country) {
		this.a_age = a_age;
		this.a_name = a_name;
		this.County = Country;
	}

	public String toString() {
		return "Applicant Name:: " + a_name + " Age of Applicant:: " + a_age + " Country of Applicant:: " + County;
	}

	public int compareTo(Visa_Applicant obj) {
		return this.a_name.compareTo(obj.a_name);
	}

}
