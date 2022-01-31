package thread_Concepts;

public class Getting_Setting_Priority {

	final int x;
	
	{
		x=100;
	}	

	public static void main(String[] args) {
		// Thread.currentThread().setPriority(7);
		PriorityCLass obj = new PriorityCLass();
		obj.setPriority(9);
		;
		obj.start();

		System.out.println("Hallo:: ");

		Getting_Setting_Priority obj2 = new Getting_Setting_Priority();
		System.out.println(obj2.x);
		

	}

}
