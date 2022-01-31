package thread_Concepts;

public class InterruptMethod extends Thread{
	
	public void run(){
		/*try{
			for(int i=0;i<3;i++){
				System.out.println("Child");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			System.out.println("LAZY");
		}*/
		
		
			for(int i=0;i<3;i++){
				System.out.println("Child");
			}
		
	}

}
