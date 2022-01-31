package strings;

public class String_Reversing {
	
	public static void main(String[] args) {
		String name="Raman Kumar";
		String[] name1=name.split(" ");
		String revString1="";
		String revString2="";
		String part1=name1[0];
		String part2=name1[1];
		
		for(int i=part1.length()-1;i>=0;i--) {
			revString1=revString1+part1.charAt(i);
		}
		
		for(int i=part2.length()-1;i>=0;i--) {
			revString2=revString2+part2.charAt(i);
		}
		
		String reverseName=revString1 + " " + revString2;
		System.out.println(reverseName);
	}

}
