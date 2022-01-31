package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_07 {

	public static void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements after reverse:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void m2(int[] num) {
		int temp = 0;
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		System.out.println("Array elements sorted in ascending order:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Second heighest element in an array:: " + num[num.length - 2]);
		System.out.println("Average of array:: " + sum / num.length);
	}

	public static void m3(int[] num) {
		int largest = num[0];
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			} else if (num[i] < smallest) {
				smallest = num[i];
			}
		}
		System.out.println("Largest element in an array:: " + largest);
		System.out.println("Smallest element in an array:: " + smallest);
	}

	public static void m4(int[] num) {
		int count = 0;
		Set<Integer> iSet = new HashSet<>();
		System.out.println("Duplicate element in an array:: ");
		for (int i : num) {
			if (iSet.add(i) == false) {
				count++;
				System.out.println(i);
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element in an array!");
		}
	}

	public static void m5(int[] num) {
		int count = 0;
		Map<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		for (int i : num) {
			if (iMap.containsKey(i)) {
				if (count < iMap.get(i)) {
					count = iMap.get(i) + 1;
				}
				iMap.put(i, iMap.get(i) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				iMap.put(i, 1);
			}
		}
		System.out.println("Occurence of elements in an array:: \n" + iMap);
	}

	public static void m6(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					isUnique = false;
				}
			}
			if (isUnique) {
				System.out.println(num[i] + " is Prime");
			} else {
				System.out.println(num[i] + " is not prime");
			}
		}
	}

	public static void m7(int[] num, int number) {
		int even = 0;
		int odd = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("count of odd element in an array :: " + odd);
		System.out.println("count of even element in an array :: " + even);

		int even_count = 0;
		int odd_count = 0;
		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("count of odd element:: " + odd_count);
		System.out.println("count of even element:: " + even_count);
	}

	public static void m8(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year");
				} else {
					System.out.println(year + " is not a leap year");
				}
			} else {
				System.out.println(year + " is a leap year");
			}
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

	public static void m9(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number is:: " + sum);
	}

	public static void m10(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Count of number:: " + count);
	}

	public static void m11(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversing :: " + reverse);
	}

	public static void m12(int[] num1, int[] num2) {
		Integer[] i1 = Arrays.stream(num1).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(num2).boxed().toArray(Integer[]::new);

		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();

		l1.addAll(Arrays.asList(i1));
		l2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<>(l1);
		s1.addAll(l2);

		Set<Integer> s2 = new HashSet<>(l1);
		s2.retainAll(l2);

		s1.removeAll(s2);
		System.out.println("Unique element between two array :: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public static void m13(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + number + " is " + fact);
	}

	public static void m14(int fiboSeries) {
		System.out.println("Fibo Series:: ");
		int first = 0;
		int second = 1;
		int temp = 0;
		System.out.print(first + " " + second);
		for (int i = 2; i < fiboSeries; i++) {
			temp = first + second;
			System.out.print(" " + temp);
			first = second;
			second = temp;

		}
	}

	public static void m15(int num1, int num2) {
		System.out.println("Swapping two numbers:: ");
		System.out.println("Before swapping num1: " + num1);
		System.out.println("Before swapping num2: " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1-num2;

		System.out.println("After swapping num1: " + num1);
		System.out.println("After swapping num2: " + num2);
	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 2, 3, 69, 1, 2 };
		int[] arr2 = { 8, 5, 2, 3, 69, 1, 2, -2 };
		int numb = 965097554;
		int year = 2000;
		int fact = 6;
		System.out.println("Array elements:: ");
		for (int i : arr) {
			System.out.println(i);
		}
		m1(arr, arr.length);
		m2(arr);
		m3(arr);
		m4(arr);
		m5(arr);
		m6(arr);
		m7(arr, numb);
		m8(year);
		m9(numb);
		m10(numb);
		m11(numb);
		m12(arr, arr2);
		m13(fact);
		m14(20);
		m15(year, fact);
	}

}
