package just_practice;

public class PercentageCalc {

	static double result;

	public static void calculator(double sub1, double sub2, double sub3, double sub4, double sub5) {
		double sum = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println("Sum of marks is:: " + sum);
		result = ((sub1 + sub2 + sub3 + sub4 + sub5) * 100) / 500;
		System.out.println("Percentage is :: " + result + "%");
	}

	public static void m1(String number) {
		try {
			int intValue = Integer.parseInt(number);
			System.out.println("Number is:: " + intValue);
		} catch (NumberFormatException e) {
			System.out.println("Entered input is not an integer");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		calculator(83, 77, 51, 40, 40);
		m1("89");
		float f = 7 / 4.0f * 9 / 2.0f;
		//float f1 = 7 / 4 * 9 / 2;
		System.out.println("F is:: " + f);
		//System.out.println("F1 is:: " + f1);

		char grade = 'B';
		grade = (char) (grade + 8);
		System.out.println("Grade is:: " + grade);

		grade = (char) (grade - 8);
		System.out.println("Grade is " + grade);

	}

}
