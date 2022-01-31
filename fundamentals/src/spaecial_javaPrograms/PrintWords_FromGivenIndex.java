package spaecial_javaPrograms;

import java.util.Scanner;

public class PrintWords_FromGivenIndex {

	public static void m1(String str) {
		int index = 2;
		String[] sSplit = str.split(" ");
		if (index >= 0 && index < sSplit.length) {
			System.out.print("Output:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		} else {
			System.out.println("Index is Invalid");
		}
	}

	public static void main(String[] args) {
		String str = "I Love My India";
		m1(str);
		new PrintWords_FromGivenIndex().m2(str); 
	}

	public void m2(String str) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the index number:: ");
		int index = scan.nextInt();
		String[] sSplit = str.split(" ");
		if (index >= 0 && index < sSplit.length) {
			System.out.print("Output:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		} else {
			System.out.println("Index is Invalid!!");
		}

	}
}
