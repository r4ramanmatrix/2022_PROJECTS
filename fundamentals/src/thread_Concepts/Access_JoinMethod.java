package thread_Concepts;

public class Access_JoinMethod {

	public static void main(String[] args) {
		JoinMethod obj = new JoinMethod();
		obj.start();
		try{
		//obj.join(3000);
			obj.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("\nThis is main Thread!!");
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread Executing!!");
		}
	}

}
