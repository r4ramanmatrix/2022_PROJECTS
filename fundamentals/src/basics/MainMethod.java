package basics;

public class MainMethod {
	
	public static void main(String[] args) {
		System.out.println("This is main method!!");
		MainMethod mobj=new MainMethod();
		mobj.PassArray();
		
		
	}
	
	private void PassArray() {
		double[] d= {11.5,22.5,33.5,44.5};
		main(d);
	}
	

	private static void main(int[] number) {
		for(int n:number) {
			System.out.println(n);
		}
	}
	
	/*protected static void main(String[] args) {
		
	}*/
	
	/*static void main(String [] args) {
		
	}*/
	
	 void main(double[] weight) {
		for(int i=0;i<weight.length;i++) {
			System.out.println(weight[i]);
		}
	}

}
