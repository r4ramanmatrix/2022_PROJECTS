package strings;

public class CountWordsInString {
	
	static String name="My name is Raman";
	static int count=1;
	public static void main(String[] args) {
		
		for(int i=0;i<name.length()-1;i++) {
			
			if((name.charAt(i)==' ') && (name.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number os words in a String are: " + count);
	}

}
