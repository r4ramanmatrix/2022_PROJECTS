package interview_questions;

public class FindMissingNumber {
	
	int num[]= {1,2,3,5};
	
	int sum=0;
	
	int missingNum=0;
	
	
	
	public void m1() {
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
			sum=sum+ num[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=1;j<=5;j++) {
			 sum1=sum1+j;
		}
		System.out.println(sum1);
		
		missingNum=sum1-sum;
		
		System.out.println("Missing number is: " + missingNum);
		
		
	}
	
	public static void main(String[] args) {
		
		FindMissingNumber obj=new FindMissingNumber();
		obj.m1();
		
			
	}

}
