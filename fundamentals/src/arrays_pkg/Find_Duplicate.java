package arrays_pkg;

public class Find_Duplicate {
	
	static int[] num= {11,22,3,4,5,611,88,22,3};
	static int temp;
	
	public static void test() {
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
			temp=num[i]+temp;
			
		} 
		System.out.println("Sum of the array is : "+ temp);
		
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]==num[j]) {
					System.out.println("Duplicate element in array is : " + num[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		test();
	}

}
