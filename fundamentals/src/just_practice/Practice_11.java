package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_11 {

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
		System.out.println("Array elements after sorting:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Average of array:: " + sum / num.length);
		System.out.println("Second heighest element in an array:: " + num[num.length - 2]);
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
			System.out.println("No Duplicate element!!");
		}
	}

	public static void m5(int[] num) {
		Set<Integer> iSet = new LinkedHashSet<>();
		System.out.println("After removed duplicate element");
		for (int i : num) {
			iSet.add(i);
		}
		Iterator<Integer> itr = iSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void m6(int[] num) {
		System.out.println("Only non repeated elements in an array:: ");
		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < num.length - 1; j++) {
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

	public static void m7(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(num[i] + " is Prime number");
			} else {
				System.out.println(num[i] + " is not a Prime number!!");
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
		System.out.println("Number of even element:: " + even);
		System.out.println("Number of odd elements:: " + odd);

		while (number > 0) {
			int rem = number % 2;
			if (rem % 10 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Even number count:: " + even_count);
		System.out.println("Odd number count:: " + odd_count);
	}

	public static void m9(int[] num) {
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
		System.out.println("Occurence of array elements :: " + iMap);
	}

	public static void m10(int[] num1, int[] num2) {
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

		System.out.println("Only unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public static void m11(int[] num) {
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
		int search_number = 122;
		while (li <= hi) {
			if (num[mi] == search_number) {
				System.out.println(search_number + " at index posion of " + mi);
				break;
			} else if (num[mi] < search_number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(search_number + " number is not available");
		}
	}

	public static void m12(int year) {
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

	public static void m13(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println("Total number in counting is :: " + count);
	}

	public static void m14(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of numbers :: " + sum);
	}

	public static void m15(int num) {
		int revNumber = 0;
		while (num != 0) {
			revNumber = revNumber * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse :: " + revNumber);
	}

	public static void m16(int[] num) {
		int temp, min = 0;
		for (int i = 0; i < num.length; i++) {
			min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[min]) {
					min = j;
				}
			}
			temp = num[i];
			num[i] = num[min];
			num[min] = temp;
		}
		System.out.println("Array Sorted:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int search_number = 99;
		while (li <= hi) {
			if (num[mi] == search_number) {
				System.out.println(search_number + " is at " + mi + " index position ");
				break;
			} else if (num[mi] < search_number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("Search number is not in array!!");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 1, 2, 99, 122, 4, 1 };
		int[] arr2 = { 2, 4, 7, 1, 2, 99, 122, 4, 11, 101 };
		int year = 2000;
		int number = 987656123;
		System.out.println("Array elements are:: ");
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
		m9(arr);
		m10(arr, arr2);
		m11(arr);
		m12(year);
		m13(number);
		m14(number);
		m15(number);
		m16(arr);
	}

}
