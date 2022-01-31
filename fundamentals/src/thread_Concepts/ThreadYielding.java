package thread_Concepts;

public class ThreadYielding extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread!");
			Thread.yield();
		}
	}
}
