package interview_questions;

public class Pyramid_Pattern {
	
	public void m1(int a) {
		
		for(int i=0;i<a;i++) {
			
			for(int j=a-i;j>1;j--) {
				
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void m2() {
		 int z=99;
	}
	
	
	public static void main(String[] args) {
		Pyramid_Pattern obj=new Pyramid_Pattern();
		obj.m1(5);;
	}

}
