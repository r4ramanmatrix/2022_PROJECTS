package arrays_pkg;

public class Sorting {
	
	static int[] sorts={22,11,3,5,1,2,9};
	
	public static void m1() {
		
		for(int i=0;i<sorts.length;i++) {
			for(int j=0;j<(sorts.length)-1;j++) {
				int k=j+1;
				int a=sorts[j];
				int b=sorts[k];
				
				if(b<a) {
					int temp1=a;
					int temp2=b;
					sorts[j]=b;
					sorts[k]=a;
				}
			}
		}
		for(int i=0;i<sorts.length;i++) {
			System.out.println(sorts[i]);
		}
	}
	
	public static void main(String[] args) {
		
		m1();
		
	}

}
