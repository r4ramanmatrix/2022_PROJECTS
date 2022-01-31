package inner_classes;

public class Outer_Inner {

	int x = 10;
	static int y = 100;

	class Inner {
		int x = 500;
		
		

		public void m1() {
			int x = 200;
			System.out.println("Inner class method");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer_Inner.this.x);
			System.out.println(y);
		}

		class InnerMost {
			public void m1() {
				System.out.println("Innermost class method");
			}
		}
	}

	public static void main(String[] args) {
		Outer_Inner o = new Outer_Inner();
		Outer_Inner.Inner i = o.new Inner();
		i.m1();
		
		new Outer_Inner().new Inner().new InnerMost().m1();
	}

}
