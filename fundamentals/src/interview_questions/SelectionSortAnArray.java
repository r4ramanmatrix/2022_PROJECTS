package interview_questions;

public class SelectionSortAnArray {
	
	public static void main(String[] args) {
				
		int arr[]= {1,5,3,2,9,7,8};
		int temp=0;
		int min=0;
		
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[min]) 
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}

		
	
