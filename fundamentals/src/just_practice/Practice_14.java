package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_14 implements Cloneable {

	public void m1(int[] num) {
		int[] tempArr = new int[num.length];
		int j = 0;

		System.out.println("Before putting logic:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0) {
				tempArr[j++] = num[i];
			}
		}
		if (j == 0 || j == num.length) {
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0) {
				tempArr[j++] = num[i];
			}
		}
		System.out.println("\nAll negative on one side:: ");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}
	}

	public void m2(int[] num) {
		List<Integer> allNum = new ArrayList<Integer>();
		List<Integer> negativeNum = new ArrayList<>();

		for (Integer data : num) {
			if (data >= 0) {
				allNum.add(data);
			} else {
				negativeNum.add(data);
			}
		}

		allNum.addAll(negativeNum);
		System.out.println("All negative number in the end:: " + allNum);
	}

	public static void m3(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements after reverse: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void m4(int[] num) {
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
		System.out.println("Array elements after sorted:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Average of array:: " + sum / num.length);
		System.out.println("Second heighest array element is:: " + num[num.length - 2]);
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
		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					isUnique = false;

				}
			}
			if (isUnique) {
				System.out.println(num[i] + " is Prime Number");
			} else {
				System.out.println(num[i] + " is not a Prime Number");
			}
		}
	}

	public static void m7(int[] num) {
		System.out.println("Array elements:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		int search_number = 21;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
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
			System.out.println(search_number + " is not present in the array!");
		}
	}

	public static void m8(int[] num) {
		Set<Integer> iSet = new HashSet<>();
		int count = 0;
		System.out.println("Duplicate element in an array:: ");
		for (int i : num) {
			if (iSet.add(i) == false) {
				count++;
				System.out.println(i);
			}
		}
		Iterator<Integer> itr = iSet.iterator();
		if (count == 0) {
			System.out.println("Array doesn't have any duplicate element and array elements are:: ");
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} else {
			System.out.println("Array elements after removed duplicates::");
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}

	public static void m9(int[] num) {
		System.out.println("Only unique element in an array:: ");
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

	public static void m10(int[] num, int number) {
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
		System.out.println("Count of even number in an array is:: " + even);
		System.out.println("Count of Odd number in an array is:: " + odd);

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of even number is:: " + even_count);
		System.out.println("Count of Odd number is:: " + odd_count);
	}

	public static void m11(int[] num) {
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
		System.out.println("Occurence of elements:: " + iMap);
	}

	public static void m12(int[] num1, int[] num2) {
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
		System.out.println("Only Unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public static void m13(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap Year!!");
				} else {
					System.out.println(year + " is not a Leap Year!!");
				}
			} else {
				System.out.println(year + " is a Leap Year!!");
			}
		} else {
			System.out.println(year + " is not a Leap Year!!");
		}
	}

	public static void m14(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count of number is:: " + count);
	}

	public static void m15(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of numbers is:: " + sum);
	}

	public static void m16(int num) {
		int reverseNum = 0;
		while (num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + reverseNum);
	}

	public static void m17(int[] num) {
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
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0) {
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
		System.out.println("\nAll Zero at the end:: ");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}
	}

	public static void m18(int[] num) {
		List<Integer> allNum = new ArrayList<>();
		List<Integer> allZero = new ArrayList<>();

		for (Integer data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data < 0) {
				allNum.add(data);
			} else {
				allZero.add(data);
			}
		}

		allNum.addAll(allZero);
		System.out.println("All zero at the end:: " + allNum);
	}

	public static void m19(int[] num) {

		int search_Number = 21;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (num[mi] == search_Number) {
				System.out.println(search_Number + " at the " + mi + " index position!!");
				break;
			} else if (num[mi] < search_Number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(search_Number + " is not available in the array!!");
		}
	}

	public static void m20(int[] num) {
		System.out.println("Before putting any logic:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		int j = 0;
		int[] tempArr = new int[num.length];

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
		System.out.println("\nAll zero in the end of the array:: ");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}

	}

	public static void m21(int[] num) {
		System.out.println("Before putting any logic:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		List<Integer> allNum = new ArrayList<>();
		List<Integer> zeroNum = new ArrayList<>();

		for (Integer data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data == 0) {
				zeroNum.add(data);
			}
		}

		allNum.addAll(zeroNum);

		System.out.println("\nAll zero in the end of the array using LIST:: " + allNum);
	}

	public static void m23(int[] num) {
		int search_Number = 9;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (num[mi] == search_Number) {
				System.out.println(search_Number + " at the " + mi + " index position");
				break;
			} else if (num[mi] < search_Number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(search_Number + " is not available in array!!");
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] arr = { 2, 1, -8, 99 - 200, 21, 5, 9 };
		int[] arr2 = { 2, 1, 0, -8, 0, 99 - 200, 21, 5, 9, 0, 101 };
		int number = 989116892;
		int year = 2032;
		Practice_14 obj1 = new Practice_14();
		Practice_14 obj2 = (Practice_14) obj1.clone();
		obj2.m1(arr);
		obj2.m2(arr);
		m3(arr, arr.length);
		m4(arr);
		m5(arr);
		m6(arr);
		m7(arr);
		m8(arr);
		m9(arr2);
		m10(arr, number);
		m11(arr2);
		m12(arr, arr2);
		m13(year);
		m14(number);
		m15(number);
		m16(number);
		m17(arr2);
		m18(arr2);
		m19(arr2);

		int[] arr3 = { 22, 1, 223, 0, 5, 0, 9, 0 };
		// m20(arr3);
		m21(arr3);
		m23(arr3);
	}

}
