package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Practice_15 implements Cloneable {

	public static void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("\nArray elements after reverse:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(a[i] + " ");
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
		System.out.println("\nArray elements sorted:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Average of array:: " + sum / num.length);
		System.out.println("Second heighest array element is:: " + num[num.length - 2]);

	}

	public static void m3(int[] num) {
		System.out.println("Only unique element in array:: ");
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

	public static void m4(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean isUnqiue = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					isUnqiue = false;
				}
			}
			if (isUnqiue) {
				System.out.println(num[i] + " is Prime Number!!");
			} else {
				System.out.println(num[i] + " is not a Prime Number!!");
			}
		}
	}

	public static void m5(int[] num) {
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

	public static void m6(int[] num) {
		System.out.println("Find duplicate element using brute force:: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}

		System.out.println("Find duplicate element using Set:: ");
		Set<Integer> iSet = new HashSet<>();
		for (int i : num) {
			if (iSet.add(i) == false) {
				System.out.println(i);
			}
		}

		System.out.println("Find duplicate element using Map:: ");
		Map<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		for (int i : num) {
			Integer count = iMap.get(i);
			if (count == null) {
				iMap.put(i, 1);
			} else {
				iMap.put(i, ++count);
			}
		}
		Set<Map.Entry<Integer, Integer>> entSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey());
			}
		}

	}

	public static void m7(int[] num) {
		System.out.println("Getting occurence of elements in an array:: ");
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
		System.out.println(iMap);
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
		System.out.println("Count of even element in an array:: " + even);
		System.out.println("Count of odd element in an array:: " + odd);

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
		System.out.println("Count of odd number:: " + odd_count);
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
		System.out.println("Only unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public static void m10(int year) {
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

	public static void m11(int[] num) {
		System.out.println("Array elements:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		int[] tempArr = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				tempArr[j++] = num[i];
			}
		}
		if (j == 0 || j == num.length) {
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				tempArr[j++] = num[i];
			}
		}
		System.out.println("\nAll zero elements in the end of the array:: ");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.print(num[i] + " ");
		}

	}

	public static void m12(int[] num) {
		System.out.println("\nArray elements:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		List<Integer> allNum = new ArrayList<>();
		List<Integer> allZero = new ArrayList<>();

		for (Integer data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data == 0) {
				allZero.add(data);
			}
		}
		allNum.addAll(allZero);
		System.out.println("\nAll zero elements in the end of the array using ArrayList");
		ListIterator<Integer> li = allNum.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}
	}

	public void m13(int[] num) {
		System.out.println("\nArray elements:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searchNumber = 99;
		while (li <= hi) {
			if (num[mi] == searchNumber) {
				System.out.println("\n" + searchNumber + " is at the " + mi + " position.");
				break;
			} else if (num[mi] < searchNumber) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searchNumber + " is not present in array!!");
		}
	}

	public void m14(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of numbers:: " + sum);
	}

	public void m15(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count of number:: " + count);
	}

	public void m16(int num) {
		int reverseNum = 0;
		while (num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: "+reverseNum);
	}

	public static void main(String[] args) {
		int[] arr = { 22, 1, 3, 4, 0, 9, 0, 11, 0 };
		int[] arr2 = { 22, 1, 3, 4, 0, 9, 0, 11, 0, 99 };
		int number = 798465132;
		int year = 2003;
		System.out.println("Array elements:: ");
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
		m9(arr, arr2);
		m10(year);
		m11(arr);
		m12(arr2);

		Practice_15 obj1 = new Practice_15();
		try {
			Practice_15 obj2 = (Practice_15) obj1.clone();
			obj2.m13(arr2);
			obj2.m14(number);
			obj2.m15(number);
			obj2.m16(number);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
