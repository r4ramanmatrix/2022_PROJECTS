package just_practice;

public class POJO_Class {

	private String name;
	private int age;

	public POJO_Class() {

	}

	public String nameSet(String name) {
		this.name = name;
		return name;
	}

	public String nameGet() {
		return this.name;
	}

	public int setAge(int age) {
		this.age = age;
		return age;
	}

	public int getAge() {
		return this.age;
	}

}
