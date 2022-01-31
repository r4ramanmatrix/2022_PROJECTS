package thread_Concepts;

public class Access_Interrupt {

	public static void main(String[] args) {
		InterruptMethod obj = new InterruptMethod();
		obj.start();
		obj.interrupt();
		System.out.println("End of Main thread!");
	}

}
