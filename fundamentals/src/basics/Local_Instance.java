package basics;

public class Local_Instance {

	int a;

	public void m1(int a) {
		
		System.out.println(a);
		System.out.println(this.a);
		this.a = a;
	}

	public static void main(String[] args) {
		System.out.println();
		Local_Instance obj = new Local_Instance();
		obj.m1(9);
	}
}
