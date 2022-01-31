package thread_Concepts;

public class Access_Yielding {

	public static void main(String[] args) {
		ThreadYielding obj = new ThreadYielding();
		obj.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread!!");
		}
	}

}
