package strings;

public class TwoStringAnagram {
	
	String s1="silent";
	String s2="listen";
	
	/*static String[] s1= {"silent"};
	static String[] s2= {"listen"};*/
	
	String temp="";
	
	public static void main(String[] args) {
		
		TwoStringAnagram obj=new TwoStringAnagram();
		
		char[] ch=obj.s1.toCharArray();
		char temp=0;
		
		for(int i=0;i<obj.s1.length();i++) {
			for(int j=0;j<obj.s1.length()-1;j++) {
				if(ch[j]>ch[j+1]) {
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		String s3=new String(ch);
		
		for(int i=0;i<obj.s1.length();i++) {
			System.out.println(ch[i]);
		}
		
		char[] ch1=obj.s2.toCharArray();
		char temp2=0;
		
		for(int i=0;i<obj.s2.length();i++) {
			for(int j=0;j<obj.s2.length()-1;j++) {
				if(ch1[j]>ch1[j+1]) {
					temp2=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp2;
				}
			}
		}
		String s4=new String(ch1);
		
		for(int i=0;i<obj.s2.length();i++) {
			System.out.println(ch1[i]);
			
		}
		if(s3.equals(s4)) {
			System.out.println("ANagram");
		}else {
			System.out.println("not an anagram");
		}
	}

}
