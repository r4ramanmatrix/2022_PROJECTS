package thread_Concepts;

public class ThreadName {

	public static void main(String[] args) {
		Getting_ThreadName obj1 = new Getting_ThreadName();
		obj1.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(obj1.getName());
		Thread.currentThread().setName("Ram lal");
		System.out.println(Thread.currentThread().getName());
		obj1.setName("child one");
		System.out.println(obj1.getName());
		// System.out.println(10/0);
		System.out.println("This line is executed by:: " + obj1.currentThread().getName());
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}

}
