package interview_questions;

public class StringMethods {
	
	public static void main(String[] args) {
		String name="Raman Kumar";
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
		
		int arr[]= {-10,-20,-100,1,2,4,5};
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest)
			{
				largest=arr[i];
			}else if(arr[i]<smallest) {
				smallest=arr[i];
			}
			
		}
		
		System.out.println("Largest Number is: " + largest);
		System.out.println("Smallest number is: " + smallest);
		
	}

}
