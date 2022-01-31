package constructor;

public class Student_Class_for_Why {

	String name;
	int age;

	public Student_Class_for_Why() {
		System.out.println("Default Constructor called");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
