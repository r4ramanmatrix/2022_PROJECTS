package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_04 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reversed!!");
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
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of Array elements :: " + sum);
		System.out.println("Second heighest element in array :: " + num[num.length - 2]);
		System.out.println("Average of array :: " + sum / num.length);
	}

	public void m3(int[] num) {

		for (int i = 0; i < num.length; i++) {
			boolean unique = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					unique = false;
				}
			}
			if (unique) {
				System.out.println(num[i] + " is Prime");
			} else {
				System.out.println(num[i] + " is not prime");
			}
		}
	}

	public void m4(int[] num) {
		System.out.println("Duplicate element in an array ::");
		int count = 0;
		Set<Integer> iSet = new HashSet<>();
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
		System.out.println("Occurence of integer value in an array :: " + iMap);
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

	public void m7(int[] num, int numbers) {
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

		while (numbers > 0) {
			int rem = numbers % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			numbers = numbers / 10;
		}
		System.out.println("Even number in an array :: " + even_count);
		System.out.println("Odd number in an array :: " + odd_count);
	}

	public void m8(int year) {
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

	public void m9(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number is :: " + sum);
	}

	public void m10(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number in counting :: " + count);
	}

	public void m11(int num) {
		int reverseNum = 0;
		while (num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse :: " + reverseNum);
	}

	public void m12(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}

	public void m13(int[] num, int[] num2) {
		Integer[] i1 = Arrays.stream(num).boxed().toArray(Integer[]::new);
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
		System.out.println("only unique element between two array :: ");
		for (int i : s1) {
			System.out.println(i);
		}

	}



	public static void main(String[] args) {
		int[] arr = { 89, 2, 2, 2, 1, 5 - 1, 6 - 9 };
		int[] arr2 = { 89, 2, 2, 2, 1, 5 - 1, 6 - 9, 99 };
		int number = 96509755;
		int YEAR = 2003;
		int FACT = 6;
		System.out.println("Array elements are:: ");
		for (int i : arr) {
			System.out.println(i);
		}

		Practice_04 obj = new Practice_04();
		obj.m1(arr, arr.length);
		obj.m2(arr);
		obj.m3(arr);
		obj.m4(arr);
		obj.m5(arr);
		obj.m6(arr);
		obj.m7(arr, number);
		obj.m8(YEAR);
		obj.m9(number);
		obj.m10(number);
		obj.m11(number);
		obj.m12(FACT);
		obj.m13(arr, arr2);
		
	}

}
