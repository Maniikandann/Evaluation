package javaEvaluation;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArray {
	public static ArrayList<Integer> addArrays(int[] arr1, int[] arr2) {
		ArrayList<Integer> result = new ArrayList<>();
		int x = 0;
		int maxLength = Math.max(arr1.length, arr2.length);
		for (int i = 0; i < maxLength || x > 0; i++) {
			int sum = x;

			if (i < arr1.length) {
				sum += arr1[arr1.length - 1 - i];
			}

			if (i < arr2.length) {
				sum += arr2[arr2.length - 1 - i];
			}

			x = sum / 10;
			result.add(0, sum % 10);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the first array:");
		int a = s.nextInt();
		int[] arr1 = new int[a];
		System.out.println("Enter the elements of the first array (one digit at a time):");
		for (int i = 0; i < a; i++) {
			arr1[i] = s.nextInt();
		}

		System.out.println("Enter the size of the second array:");
		int b = s.nextInt();
		int[] arr2 = new int[b];
		System.out.println("Enter the elements of the second array (one digit at a time):");
		for (int j = 0; j < b; j++) {
			arr2[j] = s.nextInt();
		}

		ArrayList<Integer> result = addArrays(arr1, arr2);

		System.out.println("Sum of the two arrays:");
		for (int num : result) {
			System.out.print(num);
		}
		System.out.println();
		s.close();
	}
}
