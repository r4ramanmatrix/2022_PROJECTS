package serialization_deserialzation;

import java.io.Serializable;

public class Using_transient_Variable implements Serializable {

	String Name;
	int id;
	transient int SSN;

	public Using_transient_Variable(String s, int i, int a) {
		Name = s;
		id = i;
		SSN = a;
	}

}
