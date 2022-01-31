package serialization_deserialzation;

import java.io.Serializable;

public class Customer implements Serializable{

	String custName;
	int custId;
	Address address;
	Phone phone;

	public Customer(String n, int id, Address add, Phone phn) {
		custName = n;
		custId = id;
		address = add;
		phone = phn;
	}

}
