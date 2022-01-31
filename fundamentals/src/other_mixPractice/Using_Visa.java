package other_mixPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Using_Visa {

	public static void main(String[] args) {
		Set<Visa_Applicant> sSet = new HashSet<Visa_Applicant>();
		sSet.add(new Visa_Applicant("Raman", 32, "India"));
		sSet.add(new Visa_Applicant("Corrine", 30, "USA"));
		sSet.add(new Visa_Applicant("Mel", 33, "Australlia"));
		sSet.add(new Visa_Applicant("Ella", 31, "Australlia"));

		TreeSet<Visa_Applicant> ts = new TreeSet<>(sSet);
		for (Visa_Applicant va : ts) {
			System.out.println(va);
		}
	}

}
