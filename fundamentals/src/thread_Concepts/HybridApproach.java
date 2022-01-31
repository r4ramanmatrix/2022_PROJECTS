package thread_Concepts;

public class HybridApproach {

	public static void main(String[] args) {
		HybridClass obj1 = new HybridClass();
		Thread t1 = new Thread(obj1);
		t1.start();
		System.out.println("Main Thread!!");
	}

}
