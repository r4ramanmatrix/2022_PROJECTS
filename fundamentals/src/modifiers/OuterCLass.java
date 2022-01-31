package modifiers;

public class OuterCLass {
	
	public static void main(String[] args) {
		Inner1 obj=new Inner2();
		System.out.println(obj.x);
		System.out.println(obj.display());
	}
	
}
	class Inner1{
		int x=1;
		
		int display() {
			return x;
		}
	}
	
	class Inner2 extends Inner1 {
		static int x=2;
		
		int display() {
			
			return x;
		}
	}
	
	



