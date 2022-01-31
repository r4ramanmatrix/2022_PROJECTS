package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_03 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements after reverse :: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void m2(int[] num) {
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		System.out.println("Array elements sorted :: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Average of array :: " + sum / num.length);
		System.out.println("Second heighest element in an array :: " + num[num.length - 2]);
	}


	public void m3(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean result = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					result = false;
				}
			}
			if (result) {
				System.out.println(num[i] + " is prime!!");
			} else {
				System.out.println(num[i] + " is not prime!!");
			}
		}
	}

	public void m4(int[] num) {
		System.out.println("Duplicate element in an array :: ");
		int count = 0;
		Set<Integer> intSet = new HashSet<>();
		for (int i : num) {
			if (intSet.add(i) == false) {
				count++;
				System.out.println(i);
			}
		}
		if (count == 0) {
			System.out.println("There is no duplicate element!");
		}
	}

	public void m5(int[] num) {
		int count = 0;
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for (int i : num) {
			if (intMap.containsKey(i)) {
				if (count < intMap.get(i)) {
					count = intMap.get(i) + 1;
				}
				intMap.put(i, intMap.get(i) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				intMap.put(i, 1);
			}
		}
		System.out.println("Occurence of element in an array :: \n" + intMap);
	}

	public void m6(int[] num) {
		int largest = num[0];
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			} else if (num[i] < smallest) {
				smallest = num[i];
			}
		}
		System.out.println("Largest element in an array :: " + largest);
		System.out.println("Smallest element in an array :: " + smallest);
	}

	public void m7(int[] num, int number) {
		int even = 0;
		int odd = 0;
		int even_count = 0;
		int odd_count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Count of even numbers in an array " + even);
		System.out.println("Count of odd numbers in an array " + odd);

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of even numbers " + even_count);
		System.out.println("Count of odd numbers " + odd_count);
	}

	public void m8(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is Leap Year");
				} else {
					System.out.println(year + " is not a Leap Year");
				}
			} else {
				System.out.println(year + " is a Leap Year");
			}
		} else {
			System.out.println(year + " is not a Leap Year");
		}
	}

	public void m9(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		System.out.println("Sum of number is : " + sum);
	}

	public void m10(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Count of int in a number is :: " + count);
	}

	public void m11(int number) {
		int remNumber = 0;
		while (number != 0) {
			remNumber = remNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reverse is :: " + remNumber);
	}

	public void m12(int facts) {
		int fact = 1;
		for (int i = 1; i <= facts; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + facts + " is: " + fact);
	}

	public void m13(int[] num1, int[] num2) {
		Integer[] i1 = Arrays.stream(num1).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(num2).boxed().toArray(Integer[]::new);

		List<Integer> li1 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(i1));
		li2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<Integer> s2 = new HashSet<>(li1);
		s1.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Unique element between two array :: ");
		for (int i : s1) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 8, 0, 1, 0, 2, -9 + 8, 5, 2 };
		int[] arr2 = { 8, 0, 1, 0, 2, -9 + 8, 5, 999, 1999, 2999, 9 - 1999 };
		int number = 147258369;
		int year = 2021;
		int factNumber = 6;

		System.out.println("Array elements :: ");
		for (int i : arr) {
			System.out.println(i);
		}
		Practice_03 obj = new Practice_03();
		obj.m1(arr, arr.length);
		obj.m2(arr);
		obj.m3(arr);
		obj.m4(arr);
		obj.m5(arr);
		obj.m6(arr);
		obj.m7(arr, number);
		obj.m8(year);
		obj.m9(number);
		obj.m10(number);
		obj.m11(number);
		obj.m12(factNumber);
		obj.m13(arr, arr2);
	}
}
