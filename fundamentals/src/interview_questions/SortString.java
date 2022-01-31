package interview_questions;

public class SortString {
	
	public static void main(String[] args) {
		 String sVar="Raman";
		 char temp=' ';
		 char[] ch=sVar.toCharArray();
		 
		 for(int i=0;i<sVar.length();i++) {
			 for(int j=0;j<sVar.length()-1;j++) {
				 if(ch[j]>ch[j+1]) {
					 temp=ch[j];
					 ch[j]=ch[j+1];
					 ch[j+1]=temp;
				 }
			 }
		 }
		for(int i=0;i<sVar.length();i++) {
			System.out.println(ch[i]);
		}
		
		
	}
}
