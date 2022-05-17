package interview_questions;

public class Using_Overload {

	public static void main(String[] args) {
		Overload obj = new Overload();
		int a = 2;
		double b = 3.2;

		obj.add(a, a);
		obj.add(b, b);
		System.out.println(obj.x + "=" + obj.y);

		Overload obj1 = new Overload();
		Overload obj2 = new Overload();
		
		obj1.height=1;
		obj2=obj1;
		System.out.println(obj2.height);
		
	}

}
