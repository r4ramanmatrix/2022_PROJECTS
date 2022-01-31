package just_practice;

import java.util.ArrayList;
import java.util.List;

public class All_Negative_End implements Cloneable {

	public void m1(int[] num) {
		System.out.println("Before putting logic default array elements:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		int tempAll[] = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0) {
				tempAll[j++] = num[i];
			}
		}
		if (j == num.length || j == 0) {
			return;
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0) {
				tempAll[j++] = num[i];
			}
		}
		System.out.println("\nAll negative elements in the end of the array:: ");
		for (int i = 0; i < tempAll.length; i++) {
			num[i] = tempAll[i];
			System.out.println(num[i]);
		}

	}

	public void m2(int[] num) {

		List<Integer> li1 = new ArrayList<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();

		for (Integer data : num) {
			if (data >= 0) {
				li1.add(data);
			} else {
				li2.add(data);
			}
		}

		li1.addAll(li2);
		System.out.println(li1);

	}

	public void m3(int[] num) {
		List<Integer> allNum = new ArrayList<>();
		List<Integer> zeros = new ArrayList<>();

		for (Integer data : num) {
			if (data > 0) {
				allNum.add(data);
			} else {
				zeros.add(data);
			}
		}
		allNum.addAll(zeros);
		System.out.println("All zero in the end of the array:: \n" + allNum);

	}

	public void m4(int[] num) {
		System.out.println("Before putting logic:: ");
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
		System.out.println("\nAfter putting logic:: ");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] arr = { 22, -88, -3, 12, 11, 111, -5, 55, -22 };
		int[] arr2 = { 0, 2, 0, 0, 22, 59, 62, 0, 89, 50, 121 };
		All_Negative_End obj1 = new All_Negative_End();
		All_Negative_End obj2 = (All_Negative_End) obj1.clone();
		obj2.m1(arr);
		obj2.m2(arr);
		obj2.m3(arr2);
		obj2.m4(arr2);
	}

}
