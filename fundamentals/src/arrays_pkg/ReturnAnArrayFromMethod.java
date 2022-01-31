package arrays_pkg;

public class ReturnAnArrayFromMethod {
	
	public static void main(String[] args) {
		ReturnAnArrayFromMethod obj=new ReturnAnArrayFromMethod();
		int arr[]=obj.ReturnArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public int[] ReturnArray() {
		int numbers[]= {1,2,7,8,9};
		return numbers;
	}

}
