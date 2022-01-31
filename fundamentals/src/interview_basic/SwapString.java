package interview_basic;

public class SwapString {
	
	public static void main(String[] args) {
		
		String name1="Raman";
		String name2="Kumar";
		
		System.out.println("Name1 is : " + name1);
		System.out.println("Name2 is : " + name2);
		
		name1=name1+name2;
		System.out.println(name1);
		name2=name1.substring(0, name1.length()-name2.length());
		name1=name1.substring(name2.length());
		
		System.out.println("Name1 after swapping: "+name1);
		System.out.println("Name2 after swapping: "+name2);
	}

}
