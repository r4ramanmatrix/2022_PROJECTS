package just_practice;

public class Pattern {
	
	public static void m1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		m1();
	}

}
