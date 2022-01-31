package serialization_deserialzation;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayLIst_Serialization implements Serializable {

	ArrayList<String> li = new ArrayList<>();
	
	public ArrayLIst_Serialization() {
		li.add("New Delhi");
		li.add("New York");
		li.add("New Mumbai");
		li.add("New Jersey");
	}

}
