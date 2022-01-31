package just_practice;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatedChar {
	
	static String name="raman Kumar";
	
	public static void main(String[] args) {
		int nameLength=name.length();
		System.out.println("Length of the name: " + nameLength);
		
		Map<Character, Integer> charCount=new HashMap<Character, Integer>();
		Character ch;
		
		for(int i=0;i<nameLength;i++) {
			ch=name.charAt(i);
			if(charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch)+1);
			}else {
				charCount.put(ch, 1);
			}
		}
		
		for(int j=0;j<nameLength;j++) {
			ch=name.charAt(j);
			if(charCount.get(ch)==1) {
				System.out.println("First Non repeated character is : " + ch);
				break;
			}
		}
	}

}
