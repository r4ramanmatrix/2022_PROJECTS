package may_practice;

public class UsingRunnable1 {

	public static void main(String[] args) {
		Implementing_Runnable1 obj1 = new Implementing_Runnable1();
		
		Thread t1 = new Thread(obj1);
		t1.start();
		System.out.println("Main Thread!!");
		
		System.out.println("Thread Name:: "+Thread.currentThread().getName());
	}

}
