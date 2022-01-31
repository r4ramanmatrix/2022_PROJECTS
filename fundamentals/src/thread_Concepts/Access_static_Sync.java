package thread_Concepts;

public class Access_static_Sync extends Thread {

	Static_Sync_Class obj1;
	String name;

	public Access_static_Sync(Static_Sync_Class o1, String s) {
		obj1 = o1;
		name = s;
	}

	public void run() {
		obj1.m1(name);
	}

}
