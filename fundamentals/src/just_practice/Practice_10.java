package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_10 {

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
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		System.out.println("Array sorted:: ");
		for (int i = 0; i < num.length; i++) {
			count++;
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Total element in an array :: " + count);
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Average of array:: " + sum / num.length);
		System.out.println("Second heighest element in an array:: " + num[num.length - 2]);
	}

	public static void m3(int[] num) {
		int count = 0;
		Set<Integer> iSet = new HashSet<>();
		System.out.println("Duplicate element in an array :: ");
		for (int i : num) {
			if (iSet.add(i) == false) {
				count++;
				System.out.println(i);
			}
			iSet.add(i);
		}
		if (count == 0) {
			System.out.println("No Duplicate element in an array!!");
		}

		Iterator<Integer> itr = iSet.iterator();
		System.out.println("After removed Duplicate elements:: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void m4(int[] num) {
		System.out.println("Unique element in an array:: ");
		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < num.length; j++) {
				if (i != j && num[i] == num[j]) {
					isUnique = false;
				}
			}
			if (isUnique) {
				System.out.println(num[i]);
			}
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
		System.out.println("Occurence of elements in an array:: " + iMap);
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
				System.out.println(num[i] + " is not Prime");
			}
		}
	}

	public static void m7(int[] num) {
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
		System.out.println("Smallest element in an array :: " + smallest);
	}

	public static void m8(int[] num, int number) {
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
		System.out.println("count of even number in an array:: " + even);
		System.out.println("count of Odd number in an array :: " + odd);

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("count of even number :: " + even_count);
		System.out.println("count of Odd number  :: " + odd_count);
	}

	public static void m9(int[] num1, int[] num2) {
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
		System.out.println("Unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public static void m10(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println("Total number in count is:: " + count);
	}

	public static void m11(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of numbers :: " + sum);
	}

	public static void m12(int num) {
		int revNumber = 0;
		while (num != 0) {
			revNumber = revNumber * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + revNumber);
	}

	public static void m13(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is Leap year");
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

	public static void m14(int facts) {
		int fact = 1;
		for (int i = 1; i <= facts; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + facts + " is: " + fact);
	}

	public static void m15(int fiboSeries) {
		System.out.println("Fibo Series is:: ");
		int temp = 0;
		int first = 0;
		int second = 1;
		System.out.print(first + " " + second);
		for (int i = 2; i < fiboSeries; i++) {
			temp = first + second;
			System.out.print(" " + temp);
			first=second;
			second=temp;
		}
	}
	


	public static void main(String[] args) {
		int[] arr = { 22, 1, 2, 3, 5, 1, 2 };
		int[] arr1 = { 22, 1, 2, 3, 5, 1, 2, 33 };
		int number = 987456321;
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
		m7(arr);
		m8(arr, number);
		m9(arr, arr1);
		m10(number);
		m11(number);
		m12(number);
		m13(2004);
		m14(6);
		m15(10);
	}

}
