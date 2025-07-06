package Java_Fundamentals;

import java.util.Scanner;

public class Question_33 {
	public static void main(String[] args) {
		boolean invalid = false;
		Scanner sc = new Scanner(System.in);
		int[][] arr1 = new int[2][2];
		int[][] arr2 = new int[2][2];
		for (int i = 0; i < 4; i++) {
			String input = sc.nextLine();
			try {
				if (i < 2) {
					arr1[0][i] = Integer.parseInt(input);
				} else {
					arr1[1][i - 2] = Integer.parseInt(input);
				}
			} catch (Exception e) {
				invalid = true;
				break;
			}
		}
		if (invalid)
			System.out.println("Please enter 4 integer numbers");
		else {
			System.out.println("The given array is: ");
			for (int[] i : arr1) {
				for (int j : i) {
					System.out.print(j + "  ");
				}
				System.out.println();
			}
			int k = 0;
			int m = 0;
			for (int i = 1; i >= 0; i--) {
				for (int j = 1; j >= 0; j--) {
					arr2[k][m] = arr1[i][j];
					m++;
				}
				m = 0;
				k++;
			}

			System.out.println("The reverse of the array is : ");
			for (int[] i : arr2) {
				for (int j : i) {
					System.out.print(j + "  ");
				}
				System.out.println();
			}
		}
	}
}
