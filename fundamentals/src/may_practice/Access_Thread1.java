package may_practice;

public class Access_Thread1 {

	public static void main(String[] args) {
		ThreadRun_1 obj1 = new ThreadRun_1();
		System.out.println("Child Thread Name:: " + obj1.getName());
		obj1.start();
		System.out.println("This is main thread!!");
		System.out.println("Main Thread Name:: " + obj1.currentThread().getName());

		System.out.println("Main priority:: " + Thread.currentThread().getPriority());
		System.out.println("Child priority:: " + obj1.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		
		System.out.println("Main priority:: " + Thread.currentThread().getPriority());
		System.out.println("Child priority:: " + obj1.currentThread().getPriority());
		
		
		

	}

}
