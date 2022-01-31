package strings;

import java.util.Arrays;

public class FindMissing {

	
	public static void m1(String alphabet) {
		alphabet=alphabet.toUpperCase();
		
		char[] chararray=alphabet.toCharArray();
		
		Arrays.sort(chararray);
		
		System.out.println("Missing Characters are: ");
		
		for(int i=0;i<chararray.length-1;i++) {
			int charDifference=chararray[i+1]-chararray[i];
			
			if(charDifference>1) {
				for(int j=1;j<charDifference;j++) {
					char c=(char) (chararray[i]+j);
					System.out.println(c + " ");
				}
			}
		}
	}
		
	
	public static void main(String[] args) {
		String alphabet="CaBdfghjmorsz";
		m1(alphabet);
	}

}
