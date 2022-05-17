package just_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice_36 implements Cloneable {
	int y;

	public void m1(int[] num) {
		int[] a = new int[num.length];
		int j = num.length;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("\nArray elements reversed:: ");
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
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}
		}
		System.out.println("\nSum of array elements:: " + sum);
		System.out.println("Average of array:: " + sum / num.length);
		Set<Integer> iSet = new HashSet<Integer>();

		for (int i : num) {
			iSet.add(i);
		}

		int[] newUniqueElement = new int[iSet.size()];

		int j = 0;
		for (int i : iSet) {
			newUniqueElement[j++] = i;
		}

		System.out.println("Second heighest array element is :: " + newUniqueElement[newUniqueElement.length - 3]);

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
		Set<Integer> iSet = new HashSet<Integer>();
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
				iMap.put(i, iMap.get(i) + 1);
			} else {
				iMap.put(i, 1);
			}
		}
		Set<Entry<Integer, Integer>> iSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : iSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
			}
		}
	}

	public void m7(int[] num) {

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

	public void m8(int[] num, int number) {
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
		System.out.println("Count of even element in array:: " + even);
		System.out.println("Count of odd element in array:: " + odd);

		while (number > 0) {
			int rem = 0;
			rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of even number:: " + even_count);
		System.out.println("Count of odd number:: " + odd_count);
	}

	public void m9(int[] num) {
		System.out.println("Only unqiue and non repeated number:: ");

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
		
	}

	public void m11(int[] num) {

	}

	public void m12(int[] num) {

	}

	public void m13(int[] num) {

	}

	public void m14(int[] num) {

	}

	public void m15(int[] num) {

	}

	public void m16(int[] num) {

	}

	public void m17(int[] num) {

	}

	public void m18(int[] num) {

	}

	public void m19(int[] num) {

	}

	public void m20(int[] num) {

	}

	public void m21(int[] num) {

	}

	public static void main(String[] args) {
		int[] arr1 = { -1, 22, 3, 5, 6, 0, -2, 6, 0 };
		int number = 986859572;
		Practice_36 obj1 = new Practice_36();
		
		try {
			Practice_36 obj2 = (Practice_36) obj1.clone();
			System.out.println("Array elements are:: ");
			for (int i = 0; i < arr1.length; i++) {
				if (i == arr1.length - 1) {
					System.out.print(arr1[i] + " ");
				} else {
					System.out.print(arr1[i] + ", ");
				}
			}
			obj2.m1(arr1);
			obj2.m2(arr1);
			obj2.m3(arr1);
			obj2.m4(arr1);
			obj2.m5(arr1);
			obj2.m6(arr1);
			obj2.m7(arr1);
			obj2.m8(arr1, number);
			obj2.m9(arr1);
			obj2.m10(arr1);
			obj2.m11(arr1);
			obj2.m12(arr1);
			obj2.m13(arr1);
		

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
