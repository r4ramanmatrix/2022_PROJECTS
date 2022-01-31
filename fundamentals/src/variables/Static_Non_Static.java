package variables;

public class Static_Non_Static {
	
	String name;
	int age;
	static String organizationName="GSPANN Technologies Inc.";
	
	public Static_Non_Static(String ename, int eage) {
		name=ename;
		age=eage;
	}
	
	public void display() {
		System.out.println("Employee Name: " + name + " Employee Age: " + age + " Organization: " + organizationName);
	}
	public static void main(String[] args) {
		Static_Non_Static obj1=new Static_Non_Static("Raman", 30);
		obj1.display();
		Static_Non_Static obj2=new Static_Non_Static("Mohit", 29);
		obj2.display();
		Static_Non_Static obj3=new Static_Non_Static("Other", 21);
		obj3.display();
		
		
	}

}
