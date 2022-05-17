package basics_package_2022;

public class Access_POJO_Practice_1 {
	
	public static void main(String[] args) {
		POJO_Practice_1 obj1=new POJO_Practice_1();
		obj1.seteName("Employee_1");
		obj1.setEid(8056);
		
		System.out.println("Employee Details:: "+ obj1.geteName() +" & "+ obj1.geteid());
	}

}
