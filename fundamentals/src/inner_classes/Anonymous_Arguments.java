package inner_classes;

public class Anonymous_Arguments {

	public static void main(String[] args) {
		Thread t=new Thread(new Runnable(){ 
			public void run() {
			for(int i=0;i<10;i++){
				System.out.println("Child Thread 2");
			}
		}
		});
		
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thraed 2");
		}
	}

}
