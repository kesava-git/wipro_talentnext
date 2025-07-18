package Abstraction_Packages_ExceptionHandling;

import java.util.Scanner;

public class Question_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=0;
		int[] arr=null;
			try {
				System.out.println("Enter the number of elements in the array: ");
				size=Integer.parseInt(sc.nextLine());
				arr=new int[size];
				System.out.println("Enter the elements in the array: ");
				for(int i=0;i<size;i++) {
					arr[i]=Integer.parseInt(sc.nextLine());
				}
				System.out.println("Enter the index of the array element you want to access: ");
				int idx=Integer.parseInt(sc.nextLine());
				System.out.println("The array element at index " +idx+ " = "+arr[idx]);
				System.out.println("The array element successfully accessed.");
			}catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			}
			catch(NumberFormatException e) {
				System.out.println("java.lang.NumberFormatException");
			}
	}
}
