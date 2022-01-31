package other_mixPractice;

public class Hotel_Staff {

	String emp_Name;
	int emp_age;
	int emp_id;

	public Hotel_Staff(String emp_Name, int emp_age, int emp_id) {
		this.emp_Name = emp_Name;
		this.emp_age = emp_age;
		this.emp_id = emp_id;
	}

	public String toString() {
		return "Employee Name:: " + emp_Name + " Employee Age:: " + emp_age + " Employee id:: " + emp_id;
	}
	
	

}
