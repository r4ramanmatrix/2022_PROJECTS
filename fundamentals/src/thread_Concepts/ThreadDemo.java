package thread_Concepts;

public class ThreadDemo {

	public static void main(String[] args) {
		By_ExtendingThread_Class obj = new By_ExtendingThread_Class();
		obj.start();
		for (int i = 0; i < 1; i++) {
			System.out.println("Main Thread");
		}

		String str = "HeLLo tHIS iS StATEMENt";
		int number=8;
		obj.m1(str);
		obj.m2(str);
		obj.m3(number);
		obj.m4(str);
		// obj.start();
		// obj.stop();
		// obj.run(99);
	}

}
