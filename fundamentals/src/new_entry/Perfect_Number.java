package new_entry;

public class Perfect_Number {

	public void m1(int num) {
		if (num == 0 || num == 1) {
			System.out.println("Void");
		}
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println("Number is Perfect");
		} else {
			System.out.println("Number is not Perfect");

		}
	}

	public static void main(String rama[]) {
		int number = 28;
		new Perfect_Number().m1(number);
		new Perfect_Number().m2(number);
	}

	public void m2(int number) {
		if (number == 0 || number == 1) {
			System.out.println("VOID");
		}

		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println(number + " is a perfect Number");
		} else {
			System.out.println(number + " is not a perfect Number");
		}
	}

}
