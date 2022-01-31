package interview_questions;

public class CommonElementInTwoArray {
	
	public static void main(String[] args) {
		int[] a= {1,3,4,5,6,9};
		int[] b= {2,7,8,-10,3,6};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+ " ");
				}
			}
		}
	}

}
