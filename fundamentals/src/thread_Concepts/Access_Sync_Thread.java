package thread_Concepts;

public class Access_Sync_Thread {

	public static void main(String[] args) {
		SynchronizedClass obj1 = new SynchronizedClass();
		Access_SyncThread t1 = new Access_SyncThread(obj1, "Raman");
		Access_SyncThread t2 = new Access_SyncThread(obj1, "Kumar");
		Access_SyncThread t3 = new Access_SyncThread(obj1, "Sharma");
		Access_SyncThread t4 = new Access_SyncThread(obj1, "Aditya");
		t1.start();
		//System.out.println("T1 Thread Name is:: "+t1.getName());
		t2.start();
		//System.out.println("T2 Thread Name is:: "+t2.getName());
		t3.start();
		//System.out.println("T3 Thread Name is:: "+t3.getName());
		t4.start();
		//System.out.println("T4 Thread Name is:: "+t4.getName());
		
		
	}

}
