package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_02 {

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
			sum += num[i];
			System.out.println(num[i]);
		}
		System.out.println("Sum of array elements :: " + sum);
		System.out.println("Average of array :: " + sum / num.length);
		System.out.println("Second heighest element in an array :: " + num[num.length - 2]);
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

	public void m5(int[] num) {
		int count = 0;
		Set<Integer> intSet = new HashSet<>();
		System.out.println("Duplicate element in an array :: ");
		for (int i : num) {
			if (intSet.add(i) == false) {
				count++;
				System.out.println(i);
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element in an array");
		}
	}

	public void m6(int[] num) {
		int count = 0;
		Map<Integer, Integer> intMap = new HashMap<>();
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
		System.out.println("Occurence of elements in an array :: " + intMap);
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
		System.out.println("Count of even number in an array " + even);
		System.out.println("Count of odd number in an array " + odd);

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of even number " + even_count);
		System.out.println("Count of odd number " + odd_count);
	}

	public void m8(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Total int count in a number :: " + count);
	}

	public void m9(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of int of a number :: " + sum);
	}

	public void m10(int num) {
		int revNumber = 0;
		while (num != 0) {
			revNumber = revNumber * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse :: " + revNumber);
	}

	public void m11(int[] num1, int[] num2) {
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
		System.out.println("Only unique element between two array :: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public void m12(int num) {
		if (num % 4 == 0) {
			if (num % 100 == 0) {
				if (num % 400 == 0) {
					System.out.println(num + " is a leap year");
				} else {
					System.out.println(num + " not a leap year.");
				}
			} else {
				System.out.println(num + " is a leap year.");
			}
		} else {
			System.out.println("Not a leap year");
		}
	}
	
	public void m13(int factoNumber){
		int fact=1;
		for(int i=1;i<=factoNumber;i++){
			fact*=i;
		}
		System.out.println("factorial is :: " + fact);
	}

	public static void main(String[] args) {
		int[] arr = { 8, 0, 1, 0, 2, -9 + 8, 5 };
		int[] arr2 = { 8, 0, 1, 0, 2, -9 + 8, 5, 999, 1999, 2999, 9 - 1999 };
		int number = 147258369;
		int year = 2020;
		int factNumber=6;
		System.out.println("Array elements : ");
		for (int i : arr) {
			System.out.println(i);
		}
		
		Practice_02 obj = new Practice_02();
		obj.m1(arr, arr.length);
		obj.m2(arr);
		obj.m3(arr);
		obj.m4(arr);
		obj.m5(arr);
		obj.m6(arr);
		obj.m7(arr, number);
		obj.m8(number);
		obj.m9(number);
		obj.m10(number);
		obj.m11(arr, arr2);
		obj.m12(year);
		obj.m13(factNumber);
	}

}
