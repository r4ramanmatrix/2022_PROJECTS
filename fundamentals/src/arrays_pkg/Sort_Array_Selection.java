package arrays_pkg;

public class Sort_Array_Selection {
	
	static int[] numbers= {22,11,55,33,44,99,77};
	
	public static void test() {
		
		System.out.println("Without sorted array list is: ");
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(numbers[i]);
		}
		
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=0;j<((numbers.length)-1);j++) {
				int k=j+1;
				int a=numbers[j];
				int b=numbers[k];
				
				if(b<a) {
					int temp1=a;
					int temp2=b;
					numbers[j]=b;
					numbers[k]=a;
				}
			}
			
		}
		System.out.println("* * * * * * After Sorting * * * * * * *");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		test();
	}

}
