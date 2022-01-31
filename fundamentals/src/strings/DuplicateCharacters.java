package strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
	
	String name= "Raman Kumar Sharma";
	static int cnt=0; 
	
	public static void main(String[] args) {
		DuplicateCharacters obj=new DuplicateCharacters();
		
		char[] ch=obj.name.toCharArray();
		
		Set<Character> store=new HashSet<Character>();
		
		System.out.println("Duplicate characters in a String: ");
		
		for(Character s1:ch) {
			if(store.add(s1)==false) {
				System.out.println(s1);
			}
		}
		
		//Another way
		
		for(int i=0;i<obj.name.length();i++) {
			for(int j=i+1;j<obj.name.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					cnt++;
					break;
				}
			}
		}
	}

}
