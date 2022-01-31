package interfaces;

public class Implementing_Testing implements Testing_interface1 {

	@Override
	public void m1() {
		System.out.println("This is interface impletemented method"); 
		store.add(100);
		store.add(500);
		
		for(int n1:store) {
			System.out.println(n1);
		}
	}
	
	public static void main(String[] args) {
		Testing_interface1 obj=new Implementing_Testing();
		obj.m1("Raman Kumar");
		obj.m1();
		Testing_interface1.m1(29);
	}

}
