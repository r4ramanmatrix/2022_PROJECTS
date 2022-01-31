package thread_Concepts;

public class Access_JoinMEthod_Case_2 {

	public static void main(String[] args) {
		JoinMEthod_Case_2.mt = Thread.currentThread();
		JoinMEthod_Case_2 obj = new JoinMEthod_Case_2();
		obj.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("MAININGG!!!!!!");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
