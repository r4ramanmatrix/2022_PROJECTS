package strings;

public class StringReverse_without {
	
	//Reverse a string in Java without reverse method
	
	public static void rev(String name) {
		
		char value[]=name.toCharArray();
		for(int i=value.length-1;i>=0;i--) {
			System.out.println(value[i]);
		}
	}
	
	public static void main(String[] args) {
		rev("Titanic");
	}

}
