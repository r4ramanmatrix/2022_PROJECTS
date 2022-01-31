package interview_basic;

public class SearchElement {
	
	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5,6,7,8,9};
		int li=0;
		int hi=num.length-1;
		int mi=(li+hi)/2;
		int searchNumber=11;
		
		while(li<=hi) {
			if(num[mi]==searchNumber) {
			System.out.println("Search Number at " + mi + " index position");
			break;
			}
			else if(num[mi]<searchNumber) {
				li=mi+1;
			}else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("Search number is not present in array!");
		}
	}

}
