package march_april;

import java.util.ArrayList;
import java.util.List;

public class Practice implements Cloneable {

	public void m1(int[] num) {
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
			System.out.print(num[i] + " ");
		}

	}

	public int[] m2(int[] num) {
		System.out.println("\nAll zero in the end using ArrayList:: ");
		List<Integer> allNum = new ArrayList<Integer>();
		List<Integer> zeroNum = new ArrayList<Integer>();

		for (Integer data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data == 0) {
				zeroNum.add(data);
			}
		}

		allNum.addAll(zeroNum);
		int[] arr = allNum.stream().mapToInt(i -> i).toArray();
		return arr;

	}

	public void m3(int[] num) {
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int search_Number = 0;
		while (li <= hi) {
			if (num[mi] == search_Number) {
				System.out.println("\n"+search_Number + " is at the " + mi + " index position!!");
				break;
			} else if (num[mi] < search_Number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(search_Number + " is not present in the array!!");
		}
		
		
	}

	public static void main(String[] args) {
		int[] arr = { 9, 2, 0, 1, 0, 2, 5, 0, 7 };
		System.out.println("Array elements:: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		Practice obj1 = new Practice();
		try {
			Practice obj2 = (Practice) obj1.clone();
			// obj2.m1(arr);
			obj2.m3(arr);
			for (int i : obj2.m2(arr)) {
				System.out.print(i + " ");
			}
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}

}
