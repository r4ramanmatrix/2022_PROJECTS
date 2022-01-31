package method_type;

public class ReturnType {
	
	public static void main(String[] args) {
		
		String fname="Raman";
		String lname=" Kumar";
		String names=name(fname, lname);
		System.out.println("My Name is: " + names);
		
	}
	
	public static String name(String fname, String lname) {
		String finalName=fname+lname;
		return finalName;
	}

}
