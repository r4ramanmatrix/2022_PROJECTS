package interview_questions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		int numbers[]= {1,2,2,3,4,4,5,5,6,7};
		
		//Solution 1. O(nxn)
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println(numbers[j]);
				}
			}
		}
		
		System.out.println("****************");
		
		//Solution 2. HashSet
		
		Set<Integer> store = new HashSet<Integer>();
		
		for(int num: numbers) {
			if(store.add(num)==false) {
				System.out.println(num);
			}
		}
		
	}
	
}


