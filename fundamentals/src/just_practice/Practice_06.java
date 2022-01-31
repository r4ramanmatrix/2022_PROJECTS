package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_06 {

	public void m(int num) {
		int sum = (num * (num + 1)) / 2;
		System.out.println("Sum of number is :: " + sum);
	}

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reversed :: ");
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
		System.out.println("Array elements sorted:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Second heighet element in an array :: " + num[num.length - 2]);
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
		int count = 0;
		Set<Integer> iSet = new HashSet<>();
		System.out.println("Duplicate elemnt in an array :: ");
		for (int i : num) {
			if (iSet.add(i) == false) {
				System.out.println(i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element present in an array!");
		}
	}

	public void m5(int[] num) {
		System.out.println("Occurence of integer value :: ");
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
		System.out.println(iMap);
	}

	public void m6(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(num[i] + " is Prime.");
			} else {
				System.out.println(num[i] + " is not Prime.");
			}
		}
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
		System.out.println("Count of even elements in an array :: " + even);
		System.out.println("Count of odd elements in an array :: " + odd);

		while (number > 0) {
			int rem = number % 10;
			;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of even value in number :: " + even_count);
		System.out.println("Count of odd value in number :: " + odd_count);
	}

	public void m8(int year) {
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
		System.out.println("Number in count :: " + count);
	}

	public void m11(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse :: " + reverse);
	}

	public void m12(int[] num1, int[] num2) {
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

		System.out.println("Different elemnt between two array :: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public void m13(int factNumber) {
		int fact = 1;
		for (int i = 1; i <= factNumber; i++) {
			fact *= i;
		}
		System.out.println("Factorial is :: " + fact);
	}

	public void m14(int fibo) {
		int first = 0;
		int second = 1;
		int temp = 0;
		System.out.print(first + " " + second);
		for (int i = 2; i < fibo; i++) {
			temp = first + second;
			System.out.print(" " + temp);
			first = second;
			second = temp;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 2, 10 - 12, 0 - 2, 1, 3, 6, 99, -88 };
		int[] arr2 = { 2, 10 - 12, 0 - 2, 1, 3, 6, 99, -88 - 1 };
		int number = 29122020;
		int year = 2003;
		int fact = 6;
		System.out.println("Array elements :: ");
		for (int i : arr) {
			System.out.println(i);
		}

		Practice_06 obj = new Practice_06();
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
		obj.m12(arr, arr2);
		obj.m13(fact);
		obj.m14(fact);
		System.out.println();

		int[] a = new int[6];
		Arrays.fill(a, 12);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Value of a[" + i + "]: " + a[i]);
		}

		int[] b = new int[5];
		for (int i = 0; i < b.length; i++) {
			b[i] = i + 1;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("Value of b[" + i + "]: " + b[i]);
		}
	}

}
