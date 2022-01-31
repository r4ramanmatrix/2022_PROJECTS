package just_practice;

import java.util.HashSet;
import java.util.Set;

public class Practicing {

	public int[] nums() {
		int[] arr = { 1, 9, -10, 100, 101 };
		return arr;
	}

	public static void arrs(int num[], int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}

		System.out.println("Reverse order of array is: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Practicing obj = new Practicing();
		int[] numbers = obj.nums();
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		int[] Numb = { 11, 99, 88, 77, -10, 99 };	
		Practicing.arrs(Numb, Numb.length);

		System.out.println("***********");
		int temp1 = 0;
		for (int i = 0; i < Numb.length; i++) {
			for (int j = 0; j < Numb.length - 1; j++) {
				if (Numb[j] > Numb[j + 1]) {
					temp1 = Numb[j];
					Numb[j] = Numb[j + 1];
					Numb[j + 1] = temp1;
				}
			}
		}
		for (int i = 0; i < Numb.length; i++) {
			System.out.println(Numb[i]);
		}

		int largest = Numb[0];
		int smallest = Numb[0];

		for (int i = 0; i < Numb.length; i++) {
			if (Numb[i] > largest) {
				largest = Numb[i];
			} else if (Numb[i] < smallest) {
				smallest = Numb[i];
			}
		}

		System.out.println("Largest : " + largest);
		System.out.println("Smallest: " + smallest);

		System.out.println("Duplicate element in an array: ");

		Set<Integer> store = new HashSet<>();
		for (int n : Numb) {
			if (store.add(n) == false) {
				System.out.println(n);
			}
		}

		int fact = 1;
		int factNumber = 5;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial is: " + fact);

		int pNumber = 7;
		int temp2 = 0;
		for (int i = 2; i <= pNumber - 1; i++) {
			if (pNumber % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("Number is prime number");
		} else {
			System.out.println("Not a prime number");
		}

		String name1 = "Raman Kumar";
		String rev = "";
		for (int i = name1.length() - 1; i >= 0; i--) {
			rev = rev + name1.charAt(i);
		}
		System.out.println(rev);

		String[] name2 = name1.split(" ");
		String part1 = name2[0];
		String part2 = name2[1];
		String rev1 = "";
		String rev2 = "";
		for (int i = part1.length() - 1; i >= 0; i--) {
			rev1 = rev1 + part1.charAt(i);
		}
		for (int i = part2.length() - 1; i >= 0; i--) {
			rev2 = rev2 + part2.charAt(i);
		}
		String rev3 = "";
		System.out.println(rev3 = rev1 + " " + rev2);

		String pali = "eyde";
		String rev4 = "";
		for (int i = pali.length() - 1; i >= 0; i--) {
			rev4 = rev4 + pali.charAt(i);
		}
		if (rev4.equals(pali)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("Not a Palindrome String");
		}

		String name5 = "!@#$^&R4455A()*&M76597A{}{}{}N";

		System.out.println(name5.replaceAll("[^a-zA-Z]", ""));

		int numb = 987654321;
		int count = 0;
		int sum = 0;
		int rem = 0;
		while (numb > 0) {
			numb = numb / 10;
			count++;
		}
		System.out.println("Number of digits in numb variable is: " + count);

		while (numb > 0) {
			rem = numb % 10;
			sum = sum + rem;
			numb = numb / 10;
		}

		System.out.println("Addition of numbers are: " + sum);

		int count2 = 0;
		for (int i = 0; i <= name1.length() - 1; i++) {
			if (Character.isLetter(name1.charAt(i))) {
				count2++;
			}
		}

		System.out.println("Number of letters in String: " + count2);

		char[] ch = name1.toCharArray();

		System.out.println("Duplicate character in String: ");

		Set<Character> store2 = new HashSet<>();
		for (char n1 : ch) {
			if (store2.add(n1) == false) {
				System.out.println(n1);
			}
		}

		String name01 = "Raman";
		String name02 = "Kumar";

		System.out.println("Name01 before swapping :" + name01);
		System.out.println("Name02 before swapping :" + name02);

		name01 = name01 + name02;
		name02 = name01.substring(0, name01.length() - name02.length());
		name01 = name01.substring(name02.length());

		System.out.println("Name01 after swapping :" + name01);
		System.out.println("Name02 after swapping :" + name02);
	}

}
