package arrays_pkg;

public class Sort_Array_Bubbly {
	
	static int[] num= {9,6,5,8,11,22,1,0,44,55,99};
	
	public static void test() {
		System.out.println("Numbers in array are: ");
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		for(int i=1;i<=(num.length)-1;i++) {
			for(int j=0;j<(num.length)-1;j++) {
				int k=j+1;
				int a=num[j];
				int b=num[k];
				if(b<a) {
					int temp1=a;
					int temp2=b;
					num[j]=b;
					num[k]=a;
				}
			}
		}
		System.out.println("******* Sorted ********");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
	
	public static void main(String[] args) {
		test();
	}
	

}
