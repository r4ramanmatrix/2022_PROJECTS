package basics;

public class Pojo_Usage {

	public static void main(String[] args) {
		POJO_Class obj1 = new POJO_Class();
		obj1.setName("Raman");
		obj1.setAge(32);
		System.out.println("Name is:: "+obj1.getName() + " AND"+ " Age is:: " + obj1.getAge());
	}

}
