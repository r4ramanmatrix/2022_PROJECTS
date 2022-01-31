package method_type;

public class ReturnValueFromMethod {
	
	public static void main(String[] args) {
		ReturnValueFromMethod obj=new ReturnValueFromMethod();
		String myName=obj.name();
		System.out.println("My first name is: " + myName);
	}
	
	public String name() {
		String name="Raman";
		return name;
	}

}
