package interfaces;

public class ImplementingA_A2 implements A, A2 {

	public void m1(int a, int b) {
		int result = a + b;
		System.out.println("Value of a and b :: " + a + " = " + b);
		System.out.println("Result of addition is:: " + result);
	}

	public static void main(String[] args) {
		A obj1 = new ImplementingA_A2();
		A2 obj2 = new ImplementingA_A2();
		obj1.m1(A.x, A.y);
		obj2.m1(A2.x, A2.y);
	}

}
