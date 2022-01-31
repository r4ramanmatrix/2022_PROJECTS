package inner_classes;

public class Anonymoux_Inner {

	public static void main(String[] args) {
		Choclate c = new Choclate() {
			public void m1() {
				System.out.println("MILK Choclate");
			}
		};
		c.m1();

		Choclate c1 = new Choclate() {
			public void m1() {
				System.out.println("DARK");
			}
		};
		
		c1.m1();
		
		System.out.println(c.getClass().getName().equalsIgnoreCase("inner_classes.Anonymoux_Inner$1"));

	}

}
