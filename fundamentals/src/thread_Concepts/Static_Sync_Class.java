package thread_Concepts;

public class Static_Sync_Class {

	public static synchronized void m1(String name) {
		for (int i = 0; i < 3; i++) {
			System.out.println("Method name is: ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}

	}

	public static synchronized void m2(String name) {
		for (int i = 0; i < 3; i++) {
			System.out.println("Method name is : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

	public static synchronized void m3() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Method name is m3");
		}
	}

	public static synchronized void m4() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Method name is m4");
		}
	}

	static void m5() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Method name is m5");
		}
	}

	synchronized void m6() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Method name is m6");
		}
	}

	public void m7() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Method name is m7");
		}
	}
}
