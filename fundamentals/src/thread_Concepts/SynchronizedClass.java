package thread_Concepts;

public class SynchronizedClass {

	synchronized public void m1(String name) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(name + "\n");

		}
	}

	public void m2() {
		System.out.println("Non-Synchronized Method!!");
	}

}
