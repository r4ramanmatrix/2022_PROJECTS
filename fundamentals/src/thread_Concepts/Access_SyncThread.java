package thread_Concepts;

public class Access_SyncThread extends Thread {

	SynchronizedClass obj;
	String name;

	public Access_SyncThread(SynchronizedClass c, String s) {
		obj = c;
		name = s;
	}

	public void run() {
		obj.m1(name);
		obj.m2();
	}

}
