package serialization_deserialzation;

import java.io.Serializable;

public class SerialversionUID implements Serializable {

	private static final long serialVersionUID = 100l;
	String name;
	int id;

	public SerialversionUID(String s, int i) {
		name = s;
		id = i;
	}

}
