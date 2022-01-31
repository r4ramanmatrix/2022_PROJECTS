package basics;

public class POJO_Class {

	private String name;
	private int age;

	public POJO_Class() {

	}

	public String setName(String name) {
		this.name = name;
		return name;
	}

	public int setAge(int age) {
		this.age = age;
		return age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}
