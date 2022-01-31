package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_09 implements Cloneable {

	public static void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reversed:: ");
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
		System.out.println("Array elements sorted:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Second heighest array element :: " + num[num.length - 2]);
		System.out.println("Average of array :: " + sum / num.length);
	}

	public static void m3(int[] num) {
		System.out.println("Prime Numbers in an array:; ");
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
				System.out.println(num[i] + " is not Prime");
			}
		}
	}

	public void m4(int[] num) {
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
			System.out.println("No Duplicate");
		}
	}

	public static void m5(int[] num) {
		int count = 0;
		Map<Integer, Integer> iMap = new LinkedHashMap<>();
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
		System.out.println("Occurence of array elements:: " + iMap);
	}

	public static void m6(int[] num) {
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
		System.out.println("Smallest element in an array:: " + smallest);
	}

	public static void m7(int[] num, int numb) {
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
		System.out.println("Even number in an array :: " + even);
		System.out.println("Odd number in an array :: " + odd);

		while (numb > 0) {
			int rem = numb % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			numb = numb / 10;
		}
		System.out.println("Even number  :: " + even_count);
		System.out.println("Odd number  :: " + odd_count);
	}

	public static void m8(int[] num1, int[] num2) {
		Integer[] i1 = Arrays.stream(num1).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(num2).boxed().toArray(Integer[]::new);

		List<Integer> li1 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(i1));
		li2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<Integer> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public static void m9(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap Year");
				} else {
					System.out.println(year + " is not a Leap Year");
				}

			} else {
				System.out.println(year + " is a Leap year");
			}
		} else {
			System.out.println(year + " is not a Leap year");
		}
	}

	public static void m10(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Total count:: " + count);
	}

	public static void m11(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number:: " + sum);
	}

	public static void m12(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + reverse);
	}

	public static void m13(int facto) {
		int fact = 1;
		for (int i = 1; i <= facto; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + facto + " is: " + fact);
	}

	public static void m14(int fiboS) {
		System.out.println("Fibo Series of " + fiboS + " is: ");
		int first = 0;
		int second = 1;
		int temp = 0;
		System.out.print(first + " " + second);
		for (int i = 2; i < fiboS; i++) {
			temp = first + second;
			System.out.print(" " + temp);
			first = second;
			second = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 23, 1, 5, 7, 88, 5 };
		int[] arr2 = { 23, 1, 5, 7, 88, 55 };
		int year = 2000;
		int fact = 6;
		int fiboSeries = 10;
		int number = 987965375;
		System.out.println("Array elements: ");
		for (int i : arr) {
			System.out.println(i);
		}
		m1(arr, arr.length);
		m2(arr);
		m3(arr);
		Practice_09 obj = new Practice_09();
		try {
			Practice_09 obj2 = (Practice_09) obj.clone();
			obj2.m4(arr);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		m5(arr);
		m6(arr);
		m7(arr, number);
		m8(arr, arr2);
		m9(year);
		m10(number);
		m11(number);
		m12(number);
		m13(fact);
		m14(fiboSeries);
	}

}
