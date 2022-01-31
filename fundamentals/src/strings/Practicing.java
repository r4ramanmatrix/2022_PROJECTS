package strings;


public class Practicing {
	
	public static void main(String[] args) {
		String name1="silent";
		
		String name2="listen";
		
		char temp=0;
		
		char[] ch1=name1.toCharArray();
		char[] ch2=name2.toCharArray();
		
		for(int i=0;i<name1.length();i++) {
			for(int j=0;j<name1.length()-1;j++) {
				if(ch1[j]>ch1[j+1]) {
					temp=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
				}
			}
		}
		
		String s1=new String(ch1);
		
		for(int i=0;i<name2.length();i++) {
			for(int j=0;j<name2.length()-1;j++) {
				if(ch2[j]>ch2[j+1]) {
					temp=ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=temp;
				}
			}
		}
		
		String s2=new String(ch2);
		
		if(s1.equals(s2)) {
			System.out.println("Entered names are anagrams");
		}else {
			System.out.println("Entered names are not anagrams");
		}
	}
}

