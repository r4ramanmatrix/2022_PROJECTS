package strings;

public class DisplayString {
	
	public static void display(String name) {
		
		System.out.println(name.substring(0, 4).toLowerCase());
		System.out.println(name.substring(5, 7).toUpperCase());
		System.out.println(name.substring(8, 15).toLowerCase());
		System.out.println(name.substring(16, 21).toUpperCase());
	}
	

	public static void main(String[] args) {
		display("This is testing world");
	}
}