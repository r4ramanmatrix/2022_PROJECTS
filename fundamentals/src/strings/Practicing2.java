package strings;

public class Practicing2 {
	
	public static void main(String[] args) {
		String name="Raman Kumar";
		int count=1;
		int count2=1;
		
		for(int i=0;i<name.length()-1;i++) {
			if((name.charAt(i)==' ') && (name.charAt(i+1))!=' ') {
				count++;
			}
		}
		System.out.println(count);
		
		for(int i=0;i<name.length()-1;i++) {
			if(Character.isLetter(name.charAt(i))) {
				count2++;
			}
		}
		System.out.println("Number of letters in name : " + count2);
	}

}
