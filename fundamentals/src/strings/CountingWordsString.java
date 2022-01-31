package strings;

public class CountingWordsString {
	
	static String name="Rama n ku m ar";
	static int count=1;
	static int count2=1;
	static String rev="";
	static String alpha="ABC123";
	public static void main(String[] args) {
		
		
		for(int i=0;i<name.length()-1;i++) {
			if((name.charAt(i)==' ') && (name.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number of words are: " + count);
		
		for(int i=0;i<name.length()-1;i++) {
			if(Character.isLetter(name.charAt(i))) {
				count2++;
			}
		}
		
		System.out.println("Number of letters in a String : "+count2);
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println(name.replaceAll(" ", ""));
		
		System.out.println(alpha.replaceAll("[^0-9]", ""));
	}

}
