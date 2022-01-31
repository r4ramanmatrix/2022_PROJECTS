package new_entry;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Is_Array_Sorted {

	public boolean arraySorted(int[] num) {
		Arrays.sort(num);
		System.out.println("Array is: ");
		for (int i : num) {
			System.out.println(i);
		}
		boolean isSorted = true;
		if (num == null || num.length == 1) {
			isSorted = true;
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				isSorted = false;
			}
		}
		return isSorted;
	}

	public int divideConquer(int[] num, int low, int high) {
		int pivot = num[(low + high) / 2];
		while (low <= high) {
			while (num[low] < pivot) {
				low++;
			}
			while (pivot < num[high]) {
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
		int pi = divideConquer(num, low, high);
		if (low < pi - 1) {
			quickSort(num, low, pi - 1);
		}
		if (pi < high) {
			quickSort(num, pi, high);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Array Sorted:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

	public void m1(int[] num) {
		if (arraySorted(num)) {
			System.out.println("Array already Sorted!!");
		} else {
			System.out.println("Array Not Sorted, Please press enter to sort!!");
			Scanner scan = new Scanner(System.in);
			String enter = scan.nextLine();
			quickSort(num, 0, num.length - 1);
			sortedArray(num);
		}
	}

	public void m2(int num) {
		int sum = 0;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a Perfect number!!");
		} else {
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;
				}
			}
			if (sum == num) {
				System.out.println(num + " is a Perfect Number!");
			} else {
				System.out.println(num + " is not a Perfect Number!");
			}
		}

	}

	public void m3(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("Quotient is:: " + num1 / num2);
			System.out.println("Remainder is:: " + num1 % num2);
		} else {
			System.out.println("Quotient is:: " + num2 / num1);
			System.out.println("Remainder is:: " + num2 % num1);
		}
	}

	public void m4(int num) {
		System.out.println("Multiplication Table of " + num + " is: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

	public int[] m5() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of elements you want to store: ");

		int num = scan.nextInt();

		int[] arr = new int[num];

		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Array is:: ");
		for (int i : arr) {
			System.out.println(i);
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] arr2 = { 11, 23, 5, 0, 9, 8, 0, -8, 8, 0, 101 };
		int[] arr3 = { 11, 23, 5, 0, 9, 8, 0, -8, 8, 0, 101,1 };
		Find_Is_Array_Sorted obj1 = new Find_Is_Array_Sorted();
		obj1.m1(arr2);
		obj1.m2(6);
		obj1.m3(101, 1000);
		obj1.m4(12);
		obj1.m7(arr3);
		int[] arr5 = obj1.m5();
		System.out.println("***************** ARRAY ******************");
		for (int i : arr5) {
			System.out.println(i);
		}
		obj1.m6(arr5);

	}

	public void m7(int[] num) {
		System.out.println("******************************************");
		boolean isSorted = true;
		if (num == null || num.length == 1) {
			isSorted = true;
		} else {
			for (int i = 1; i < num.length; i++) {
				if (num[i - 1] > num[i]) {
					isSorted = false;
				}
			}
		}
		System.out.println("Is Array Sorted:: " + isSorted);
	}

	public void m6(int[] num) {
		boolean isSorted = true;
		if (num == null || num.length == 1) {
			System.out.println("VOID!!");
		} else {
			for (int i = 1; i < num.length; i++) {
				if (num[i - 1] > num[i]) {
					isSorted = false;
				}
			}
			if (isSorted) {
				System.out.println("Array is Sorted");
			} else {
				System.out.println("Array is not Sorted");
			}
		}
	}

}
