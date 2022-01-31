package modifiers;

public class Class2 extends Class1{
	
	public void display() {
		super.display();
		System.out.println("Sharma");
	}
	
	public static void main(String[] args) {
		Class1 obj=new Class2();
		obj.display();
	}

}
