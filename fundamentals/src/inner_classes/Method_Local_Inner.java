package inner_classes;

public class Method_Local_Inner {

	int x = 99;
	static int y = 999;

	public void m1() {

		int z = 1001;

		class Inner_Method_Class {

			public void sum(int x, int y) {
				System.out.println("The sum of x & y : " + (x + y));
			}

			public void display() {
				System.out.println("Value of Outer class x & Y IS : " + x + " " + y);
				System.out.println("The value of z of local variable is : " + z);
			}
		}
		Inner_Method_Class imc = new Inner_Method_Class();
		imc.sum(10, 100);
		imc.sum(100, 100);
		imc.sum(1000, 100);
		imc.display();
	}

	public static void main(String[] args) {
		Method_Local_Inner obj = new Method_Local_Inner();
		obj.m1();
	}

}
