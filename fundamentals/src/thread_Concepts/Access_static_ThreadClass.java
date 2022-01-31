package thread_Concepts;

public class Access_static_ThreadClass {

	public static void main(String[] args) {
		Static_Sync_Class obj1 = new Static_Sync_Class();
		Access_static_Sync t1 = new Access_static_Sync(obj1, "m1");
		Access_staticSync t2 = new Access_staticSync(obj1, "m2");
		t1.start();
		t2.start();
		System.out.println("Main Thread!");

	}

}
