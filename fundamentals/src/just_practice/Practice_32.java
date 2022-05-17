package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice_32 implements Cloneable {

	public void m1(int[] num) {
		int[] a = new int[num.length];
		int j = num.length;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements after reversed:: ");
		for (int i = 0; i < num.length; i++) {
			if (i == num.length - 1) {
				System.out.print(a[i] + " ");
			} else {
				System.out.print(a[i] + ", ");
			}

		}
	}

	public void m2(int[] num) {
		System.out.println("\nSorted array elements:: ");
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
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}
		}
		System.out.println("\nSum of array elements:: " + sum);
		System.out.println("Average of an array:: " + sum / num.length);
		System.out.println("Second heighest array element:: " + num[num.length - 2]);

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
		System.out.println("Largest element in an array:: " + largest);
		System.out.println("Smallest element in an array:: " + smallest);
	}

	public void m4(int[] num) {
		System.out.println("Finding duplicate element using brute force:: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}

	public void m5(int[] num) {
		System.out.println("Finding duplicate element using Set:: ");
		Set<Integer> iSet = new HashSet<>();
		for (int i : num) {
			if (iSet.add(i) == false) {
				System.out.println(i);
			}
		}
	}

	public void m6(int[] num) {
		System.out.println("Finding duplicate element using Map:: ");
		Map<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		for (int i : num) {
			if (iMap.containsKey(i)) {
				Integer count = iMap.get(i);
				iMap.put(i, iMap.get(i) + 1);
			} else {
				iMap.put(i, 1);
			}
		}
		Set<Entry<Integer, Integer>> entSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
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
		System.out.println("Count of Even number:: " + even);
		System.out.println("Count of Odd number:: " + odd);

		while (number != 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of Even number:: " + even_count);
		System.out.println("Count of Odd number:: " + odd_count);
	}

	public void m8(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(num[i] + " is a Prime Number");
			} else {
				System.out.println(num[i] + " is not a Prime Number");
			}
		}
	}

	public void m9(int[] num) {
		System.out.println("Only unique and non-repeated number: ");
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

	public void m10(int[] num) {
		System.out.println("All zero element in the end of the array: ");
		if (num == null || num.length == 1) {
			return;
		}
		int[] tempArr = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				tempArr[j++] = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0 || num[i] == 0) {
				tempArr[j++] = num[i];
			}
		}
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}
	}

	public void m11(int[] num) {
		System.out.println("All zero element in the end of the array using List: ");
		ArrayList<Integer> allNum = new ArrayList<>();
		ArrayList<Integer> allZero = new ArrayList<>();
		for (Integer data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data <= 0) {
				allZero.add(data);
			}
		}
		allNum.addAll(allZero);
		Iterator<Integer> itr = allNum.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public void m12(int[] num) {
		int j = num.length - 1;
		System.out.println("All Zero in the beginning of the array:: ");
		for (int i = num.length - 1; i >= 0; i--) {
			if (num[i] != 0) {
				num[j] = num[i];
				j--;
			}
		}
		while (j >= 0) {
			num[j] = 0;
			j--;
		}
		for (int i = 0; i < num.length; i++) {
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}

		}
	}

	public void m13(int[] num) {
		System.out.println("\nArray elements before searching should be sorted:: ");
		Arrays.sort(num);
		for (int i : num) {
			System.out.println(i);
		}
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searching_number = 3;
		while (li <= hi) {
			if (num[mi] == searching_number) {
				System.out.print(searching_number + " present at the " + mi + " index location!!");
				break;
			} else if (num[mi] < searching_number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (hi + li) / 2;
		}
		if (li > hi) {
			System.out.println(searching_number + " is not present in array!!");
		}
	}

	public void m14(int[] num) {

		System.out.println("\nOccurence of array elements::");
		Map<Integer, Integer> iMap = new HashMap<>();
		int count = 0;
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

	public void m15(int[] num1, int[] num2) {
		System.out.println("Unique element between two array:: ");
		Integer[] i1 = Arrays.stream(num1).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(num2).boxed().toArray(Integer[]::new);

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.addAll(Arrays.asList(i1));

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<>(al1);
		s1.addAll(al2);

		Set<Integer> s2 = new HashSet<>(al1);
		s2.retainAll(al2);

		s1.removeAll(s2);

		for (int i : s1) {
			System.out.println(i);
		}
	}

	public void m16(int[] num) {
		System.out.println("is Array Sorted?:: ");
		boolean isSorted = true;
		if (num == null || num.length == 1) {
			isSorted = true;
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				isSorted = false;
			}
		}
		// System.out.println("is Array Sorted?:: "+isSorted);
		if (isSorted) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}

	public int divideConquer(int low, int high, int[] num) {
		int pivot = num[(low + high) / 2];
		while (low <= high) {
			while (num[low] < pivot) {
				low++;
			}
			while (num[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = num[high];
				num[high] = num[low];
				num[low] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	public void quickSort(int low, int high, int[] num) {
		int pi = divideConquer(low, high, num);
		if (pi - 1 > low) {
			quickSort(low, pi - 1, num);
		}
		if (pi < high) {
			quickSort(pi, high, num);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("\nSorted Array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m17(int number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Number in count is:: " + count);
	}

	public void m18(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
		}

		System.out.println("Sum of number :: " + sum);
	}

	public void m19(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + rev);
	}

	public void m20(int year) {
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

	public void m21(int num) {
		System.out.println("Perfect divisor of " + num + " is:: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void m22(int num) {
		System.out.println("Pattern is:: ");
		int k = 1;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println(" ");
		}
	}

	public void m23(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println(num + " Sum is a Perfect Number!!");
		} else {
			System.out.println(num + " Sum is not a Perfect Number!!");
		}
	}

	public void m24(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + num + " is:: " + fact);
	}

	public void m25(int[] num) {
		System.out.println("0 beginning in the array:: ");
		int j = num.length - 1;
		for (int i = num.length - 1; i >= 0; i--) {
			if (num[i] != 0) {
				num[j] = num[i];
				j--;
			}
		}
		while (j >= 0) {
			num[j] = 0;
			j--;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

	public void m26(int[] num1, int[] num2) {
		if (num1.length != num2.length) {
			System.out.println("Length of the array should be equal!!");
		}
		Arrays.sort(num1);
		Arrays.sort(num2);
		int[] sums = new int[num1.length];
		for (int i = 0; i < sums.length; i++) {
			sums[i] = num1[i] + num2[i];
		}
		System.out.println("Sum of array elements:: ");
		for (int i = 0; i < sums.length; i++) {
			System.out.println(sums[i]);
		}
	}

	public void m27(int[] num) {
		System.out.println("Initial array:: ");
		int count = 0;
		for (int i : num) {
			if (i == num.length - 1) {
				System.out.print(i + " ");
			} else {
				System.out.print(i + ", ");
			}
		}
		System.out.println("\nInsert an item into an array at a specific index");

		for (int i = 0; i < num.length; i++) {
			count++;
			if (count == 4) {
				num[i] = 88;
			}

		}
		for (int i : num) {
			System.out.println(i);
		}

	}

	public void m28(int[] num1, int[] num2) {

		int[] mergingArr = new int[num1.length + num2.length];
		int k = 0;
		for (int i : num1) {
			mergingArr[k] = i;
			k++;
		}
		for (int i : num2) {
			mergingArr[k] = i;
			k++;
		}
		for (int i=0;i<mergingArr.length;i++) {
			if (i == mergingArr.length - 1) {
				System.out.print(mergingArr[i] + " ");
			} else {
				System.out.print(mergingArr[i] + ", ");
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 102, 2, 3, 0, 1, 0, -6 };
		int[] arr2 = { 102, 2, 3, 0, 1, 0, -6, 9 };
		int[] arr3 = { 102, 2, 3, 0, 1, 0, -6, 9 };
		int number = 986859572;
		Practice_32 obj1 = new Practice_32();
		try {
			Practice_32 obj2 = (Practice_32) obj1.clone();
			obj2.m1(arr);
			obj2.m2(arr);
			obj2.m3(arr);
			obj2.m4(arr);
			obj2.m5(arr);
			obj2.m6(arr);
			obj2.m7(arr, number);
			obj2.m8(arr);
			obj2.m9(arr);
			obj2.m10(arr);
			obj2.m11(arr2);
			obj2.m12(arr2);
			obj2.m13(arr);
			obj2.m14(arr2);
			obj2.m15(arr, arr2);
			obj2.m16(arr2);
			obj2.quickSort(0, arr2.length - 1, arr2);
			obj2.sortedArray(arr2);
			obj2.m17(number);
			obj2.m18(number);
			obj2.m19(number);
			obj2.m20(2004);
			obj2.m21(33);
			obj2.m22(10);
			obj2.m23(6);
			obj2.m24(6);
			obj2.m25(arr3);
			obj2.m26(arr2, arr3);
			obj2.m27(arr3);
			obj2.m28(arr2, arr3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
