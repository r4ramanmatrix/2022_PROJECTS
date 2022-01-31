package thread_Concepts;

public class SleepMethod {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Loading..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
