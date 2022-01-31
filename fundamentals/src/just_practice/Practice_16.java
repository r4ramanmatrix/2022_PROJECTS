package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_16 implements Cloneable {

	public void m1(int[] num, int lengths) {
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

	public int m2(int[] num, int totalNum) {

		int expSum = totalNum * (totalNum + 1) / 2;
		int actualSum = 0;
		for (int i : num) {
			actualSum += i;
		}
		return expSum - actualSum;
	}

	public void m3(int[] num) {
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
		System.out.println("Second heighest element in an array:: " + num[num.length - 2]);

	}

	public void m4(int[] num) {
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

	public void m5(int[] num) {
		System.out.println("Finding duplicate element using brute force method:: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}

		System.out.println("Finding duplicate element using Set:: ");
		Set<Integer> iSet = new HashSet<>();
		int count = 0;
		for (int i : num) {
			if (iSet.add(i) == false) {
				System.out.println(i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate element");
		}

		System.out.println("Finding duplicate element using Map:: ");
		Map<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		for (int i : num) {
			Integer count2 = iMap.get(i);
			if (count2 == null) {
				iMap.put(i, 1);
			} else {
				iMap.put(i, ++count2);
			}
		}
		Set<Map.Entry<Integer, Integer>> entSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> mapSet : entSet) {
			if (mapSet.getValue() > 1) {
				System.out.println(mapSet.getKey() + "=" + mapSet.getValue());
			}
		}
	}

	public void m6(int[] num) {
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

	public void m7(int[] num) {
		System.out.println("Only unique and non repeated number:: ");
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

	public void m8(int[] num) {
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
		System.out.println("All 0 element in the end of the array");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.print(num[i] + " ");
		}
	}

	public void m9(int[] num) {
		System.out.println("\nBefore putting logic array is: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		List<Integer> allNum = new ArrayList<>();
		List<Integer> allZero = new ArrayList<>();
		for (int data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data == 0) {
				allZero.add(data);
			}
		}
		allNum.addAll(allZero);
		System.out.println("\nAll 0 element in the end of the array");
		System.out.println(allNum);
	}

	public void m10(int[] num) {
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searching = 11;
		System.out.println("Before searching index position array is:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		while (li <= hi) {
			if (num[mi] == searching) {
				System.out.println("\n" + searching + " Number is at the " + mi + " index position");
				break;
			} else if (num[mi] < searching) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("\n" + searching + " Number is not present in array");
		}
	}

	public void m11(int[] num) {
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
		System.out.println("Occurence of array elements:: \n" + iMap);
	}

	public void m12(int[] num, int number) {
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
		System.out.println("Count of Even element is:: " + even);
		System.out.println("Count of Odd element is:: " + odd);

		while (number > 0) {
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

	public void m13(int[] num1, int[] num2) {
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
		System.out.println("Only unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public void m14(int year) {
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

	public void m15(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		System.out.println("Sum of numbers is:: " + sum);
	}

	public void m16(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Number in count is:: " + count);
	}

	public void m17(int number) {
		int reverseNumber = 0;
		while (number != 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reverse:: " + reverseNumber);
	}

	public int division(int[] num, int low, int high) {
		int pivot = num[(low + high) / 2];
		while (low <= high) {
			while (num[low] < pivot) {
				low++;
			}
			while (num[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = num[low];
				num[low] = num[high];
				num[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	public void quickSort(int[] num, int low, int high) {
		int pi = division(num, low, high);
		if (low < pi - 1) {
			division(num, low, pi - 1);
		}
		if (pi < high) {
			division(num, pi, high);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Array sorted using quick sort!!");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 6, 0, 7, 8, 9, 10 };
		int[] arr2 = { 2, 11, 2, 23, 34, 0, 6, 7, 8, 9, 2, 0, 2 };
		int[] arr3 = { 55, 2, 88, 3, 5, 9 };
		int year = 2004;
		int number = 882612515;
		System.out.println("Array elements:: ");
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		Practice_16 obj1 = new Practice_16();
		try {
			Practice_16 obj2 = (Practice_16) obj1.clone();
			obj2.m1(arr2, arr2.length);
			int n1 = obj2.m2(arr, 10);
			System.out.println("Missing number is:: " + n1);
			obj2.m3(arr2);
			obj2.m4(arr2);
			obj2.m5(arr2);
			obj2.m6(arr2);
			obj2.m7(arr2);
			obj2.m8(arr2);
			obj2.m9(arr);
			obj2.m10(arr2);
			obj2.m11(arr2);
			obj2.m12(arr2, number);
			obj2.m13(arr, arr2);
			obj2.m14(year);
			obj2.m15(number);
			obj2.m16(number);
			obj2.m17(number);
			obj2.quickSort(arr3, 0, arr3.length - 1);
			obj2.sortedArray(arr3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		double a = 100;
		double d = (double) 100;
		System.out.println(a + " and " + d);
	}

}
