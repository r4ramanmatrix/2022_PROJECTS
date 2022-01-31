package just_practice;

public class Extend_POJO {

	public static void main(String[] args) {
		POJO_Class obj = new POJO_Class();
		obj.nameSet("Raman");
		obj.setAge(32);
		System.out.println("NAME IS:: " + obj.nameGet() + " and AGE IS:: " + obj.getAge());
	}

}
