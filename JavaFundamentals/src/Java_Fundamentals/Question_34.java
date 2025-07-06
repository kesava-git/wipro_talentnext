package Java_Fundamentals;

import java.util.Scanner;

public class Question_34 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean invalid=false;
		int[][] arr1 = new int[3][3];
		for (int i = 0; i < 9; i++) {
			String input = sc.nextLine();
			try {
				if (i < 3) {
					arr1[0][i] = Integer.parseInt(input);
				} else if(i>2&&i<6) {
					arr1[1][i - 3] = Integer.parseInt(input);
				}
				else {
					arr1[2][i-6]=Integer.parseInt(input);
				}
			} catch (Exception e) {
				invalid = true;
				break;
			}
		}
		if (invalid)
			System.out.println("Please enter 9 integer numbers");
		else {
			System.out.println("The given array is :");
			for(int i[]:arr1) {
				for(int j:i) {
					System.out.print(j+"  ");
				}
				System.out.println();
			}
			int max=Integer.MIN_VALUE;
			for(int i[]:arr1) {
				for(int j:i) {
					if(j>max) {
						max=j;
					}
				}
			}
			System.out.println("The biggest number in the given array is "+max);
		}
	}
}
