package arrays_pkg;

public class Practicing2 {
	
	public static void passArr(int arr[], int lengths) {
		int[] a=new int[lengths];
		int j=lengths;
		
		for(int i=0;i<lengths;i++) {
			a[j-1]=arr[i];
			j=j-1;
		}
		System.out.println("Reverse array is:");
		for(int i=0;i<lengths;i++) {
			System.out.println(a[i]);
		}
	}
	
	
	public static int[] num() {
		int[] arr= {22,11,55,66};
		return arr;
	}
	public static void main(String[] args) {
		int[] numbers= {6,77,88,1};
		Practicing2.passArr(numbers, numbers.length);
		int[] arr2=num();
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
