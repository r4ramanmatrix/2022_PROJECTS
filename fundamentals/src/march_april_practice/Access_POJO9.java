package march_april_practice;

public class Access_POJO9 {

	public static void main(String[] args) {
		POJO_Class9 obj1 = new POJO_Class9();
		obj1.setName("Raman");
		obj1.setAge(33);
		obj1.setHeight(5.6);

		System.out.println("User Details:: \n" + obj1.getName() + "\n" + obj1.getAge() + "\n" + obj1.getHeight());
	}

}
