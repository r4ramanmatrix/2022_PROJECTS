package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_12 {

	public static void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("\nArray elements reversed:: ");
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
		System.out.println("Average of array:: " + sum / num.length);
		System.out.println("Second heighest array element:: " + num[num.length - 2]);
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
		System.out.println("Smallest element in an array :: " + smallest);
	}

	public static void m4(int[] num) {
		int count = 0;
		Set<Integer> iSet = new HashSet<>();
		System.out.println("Duplicate element in an array");
		for (int i : num) {
			if (iSet.add(i) == false) {
				count++;
				System.out.println(i);
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element");
		}
	}

	public static void m5(int[] num) {
		System.out.println("Only Unique element in array:: ");
		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < num.length; j++) {
				if (i != j && num[i] == num[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(num[i]);
			}
		}
	}

	public static void m6(int[] num) {
		System.out.println("Only unique and one time repeated element of an array:: ");
		Set<Integer> iset = new HashSet<>();
		for (int i : num) {
			iset.add(i);
		}
		System.out.println(iset);
	}

	public static void m7(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					isUnique = false;
				}
			}
			if (isUnique) {
				System.out.println(num[i] + " is a Prime number.");
			} else {
				System.out.println(num[i] + " is not a Prime number.");
			}
		}
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
		System.out.println("Count of even number in an array:: " + even);
		System.out.println("Count of odd number in an array:: " + odd);

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of even number in an array:: " + even_count);
		System.out.println("Count of odd number in an array:: " + odd_count);
	}

	public static void m9(int[] num) {
		int count = 0;
		Map<Integer, Integer> iMap = new LinkedHashMap<Integer, Integer>();
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
		System.out.println("Occurence of array elements :: " + iMap);
	}

	public static void m10(int[] num1, int[] num2) {
		Integer[] i1 = Arrays.stream(num1).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(num2).boxed().toArray(Integer[]::new);

		List<Integer> li1 = new ArrayList<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();

		li1.addAll(Arrays.asList(i1));
		li2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<Integer> s2 = new HashSet<>(li1);
		s1.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Only unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public static void m11(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap Year");
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

	public static void m12(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number :: " + sum);
	}

	public static void m13(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("number in count is :: " + count);
	}

	public static void m14(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + reverse);
	}

	public static void m15(int[] num) {
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
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int search_number = 131;
		while (li <= hi) {
			if (num[mi] == search_number) {
				System.out.println(search_number + " is at " + mi + " index position.");
				break;
			} else if (num[mi] < search_number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(search_number + " is not present in array!!");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 121, 11, 131, 66, 99, 999, 11 };
		int[] arr2 = { 121, 11, 131, 66, 99, 999, 111 };
		int number = 882612515;
		int year = 2000;
		System.out.println("Array elements are:: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		m1(arr, arr.length);
		m2(arr);
		m3(arr);
		m4(arr);
		m5(arr);
		m6(arr);
		m7(arr);
		m8(arr, number);
		m9(arr);
		m10(arr, arr2);
		m11(year);
		m12(number);
		m13(number);
		m14(number);
		m15(arr);
	}

}
