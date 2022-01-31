package thread_Concepts;

public class Getting_ThreadName extends Thread {
	public void run() {
		System.out.println("Executed by:: "+Thread.currentThread().getName());
	}

}
