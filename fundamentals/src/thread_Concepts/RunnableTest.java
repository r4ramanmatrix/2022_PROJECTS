package thread_Concepts;

public class RunnableTest {
	
	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t1=new Thread(r);
		Thread t2=new Thread();
		t1.start();
		t2.run();
		System.out.println("Main Thread!!");
		//r.start();
		//r.run();
	}

}
