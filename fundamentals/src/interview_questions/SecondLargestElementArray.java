package interview_questions;

public class SecondLargestElementArray {
	
	public int[] arrs() {
		int[] num= {11,7,5,3,2,1};
		return num;
	}
	
	public static void main(String[] args) {
		SecondLargestElementArray obj=new SecondLargestElementArray();
		int[] numbers=obj.arrs();
		System.out.println("Sorted Array");
		int temp=0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("Second largest element is: "+numbers[numbers.length-2]);
		/*System.out.println("Second smallest element is: "+numbers[1]);
		System.out.println("Second largest element is: " + numbers[4]);*/
		
		
	}

}
