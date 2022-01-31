package arrays_pkg;

import java.util.HashSet;
import java.util.Set;

public class PlayingWithArray {
	
	public static void main(String[] args) {
		
		
		
		int arr[]= {11,22,3,4,5,-10,3};
		int sum=0;
		int largest=0;
		int smallest=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		
		largest=arr[0];
		smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		
		Set<Integer> sets=new HashSet<Integer>();
		for(int nums:arr) {
			if(sets.add(nums)==false) {
				System.out.println("Duplicate numbers in the array: " + nums);
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Sorted Array is: ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Sum of the array: "+sum);
		System.out.println("Largest number in the array is : "+largest);
		System.out.println("Smallest number in the array is: " +smallest);
	}
	

}
