package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_05 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("After array elements reversed :: ");

		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void m2(int[] num) {
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
		System.out.println("Array elements sorted :: ");
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			System.out.println(num[i]);
		}

		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Second heighest array element :: " + num[num.length - 2]);
		System.out.println("Average of array :: " + sum / num.length);
	}

	
	public void m3(int[] num) {
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

	public void m4(int[] num) {
		System.out.println("Duplicate element in an array:: ");
		int count = 0;
		Set<Integer> iSet = new HashSet<>();
		for (int i : num) {
			if (iSet.add(i) == false) {
				count++;
				System.out.println(i);
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate element in an array");
		}
	}

	public void m5(int[] num) {
		int count = 0;
		Map<Integer, Integer> iMap = new HashMap<>();
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
		System.out.println("Occurence of array elements in an array :: \n" + iMap);
	}

	public void m6(int[] num, int number) {
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
		System.out.println("Count of even element in an array :: " + even);
		System.out.println("Count of odd element in an array :: " + odd);
		while (number > 0) {
			int rem = number / 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of even element :: " + even_count);
		System.out.println("Count of odd element :: " + odd_count);

	}

	public void m7(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean unique = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println("Prime Number :: " + num[i]);
			} else {
				System.out.println("Not a prime Number :: " + num[i]);
			}
		}
	}

	public void m8(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap Year");
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

	public void m9(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of numbers :: " + sum);
	}

	public void m10(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Numbers in count :: " + count);
	}

	public void m11(int num) {
		int revNumber = 0;
		while (num != 0) {
			revNumber = revNumber * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse :: " + revNumber);
	}

	public void m12(int[] num1, int[] num2) {
		Integer[] i1 = Arrays.stream(num1).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(num2).boxed().toArray(Integer[]::new);

		List<Integer> li1 = new ArrayList<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();

		li1.addAll(Arrays.asList(i1));
		li2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<Integer> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Unique element between two array :: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public void m13(int factNumber) {
		int fact = 1;
		for (int i = 1; i <= factNumber; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + factNumber + " is: " + fact);
	}

	public void m14(int fiboSeries) {
		int first = 0;
		int second = 1;
		int temp = 0;
		System.out.print(first + " " + second);
		for (int i = 2; i < fiboSeries; i++) {
			temp = first + second;
			System.out.print(" "+temp);
			first = second;
			second = temp;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 12, 22 - 23, 3, 9 - 8, 5, 9, 1 };
		int arr2[] = { 12, 22 - 23, 3, 9 - 8, 5, 9, 1, 100 };
		int number = 987654321;
		int year = 2004;
		int facts = 7;
		System.out.println("Array elements :: ");
		for (int i : arr) {
			System.out.println(i);
		}
		Practice_05 obj = new Practice_05();
		obj.m1(arr, arr.length);
		obj.m2(arr);
		obj.m3(arr);
		obj.m4(arr);
		obj.m5(arr);
		obj.m6(arr, number);
		obj.m7(arr);
		obj.m8(year);
		obj.m9(number);
		obj.m10(number);
		obj.m11(number);
		obj.m12(arr, arr2);
		obj.m13(facts);
		obj.m14(12);
	}

}
