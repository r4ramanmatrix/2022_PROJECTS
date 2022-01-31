package spaecial_javaPrograms;

public class ExtractNumbers_FromString {

	public static void m1(String str) {
		int number = Integer.valueOf(str.replaceAll("[^0-9]", ""));
		System.out.println(number);
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		System.out.println("Sum of number :: " + sum);
	}

	public static void main(String[] args) {
		String str = "raman78645kluysd8743";
		m1(str);
	}

}
