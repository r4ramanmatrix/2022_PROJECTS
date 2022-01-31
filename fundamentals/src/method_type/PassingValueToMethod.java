package method_type;

public class PassingValueToMethod {
	
	public static void main(String[] args) {
		int num1=99;
		int num2=88;
		PassingValueToMethod obj=new PassingValueToMethod();
		obj.m1(num1, num2);
		String originalName=obj.name();
		System.out.println("My name is: " +originalName);
	}

	public void m1(int number1,int number2) {
		int result=number1+number2;
		System.out.println("Adition is : " + result);
	}
	
	public String name() {
		String myName="Raman Kumar";
		return myName;
	}
}
