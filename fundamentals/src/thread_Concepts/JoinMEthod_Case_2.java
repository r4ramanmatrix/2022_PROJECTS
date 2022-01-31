package thread_Concepts;

public class JoinMEthod_Case_2 extends Thread {
	static Thread mt;

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("CHILDING!!!!");
		}
	}

}
