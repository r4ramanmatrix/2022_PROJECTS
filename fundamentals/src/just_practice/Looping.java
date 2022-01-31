package just_practice;

public class Looping {
	
	public static void m1() {
		
		for(int i=0;i<=5;i++) {
			//System.out.println(i);
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		
		for(int i=5;i>=0;i--) {
			//System.out.println(i);
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		m1();
	}

}
