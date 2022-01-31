package strings;

public class CountingLettersInString {
	
	static String name="Raman";
	static int count=1;
	
	public static void main(String[] args) {
		
		for(int i=0;i<name.length()-1;i++) {
			if(Character.isLetter(name.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

}
