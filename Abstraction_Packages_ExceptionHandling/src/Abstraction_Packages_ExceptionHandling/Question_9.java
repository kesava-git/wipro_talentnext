package Abstraction_Packages_ExceptionHandling;

import java.util.Scanner;

public class Question_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		try {
			System.out.println("Enter 5 integers:");
			for(int i=0;i<arr.length;i++) {
				arr[i]=Integer.parseInt(sc.nextLine());
				sum=sum+arr[i];
			}
			double average=sum/5.0;
			System.out.println("Sum = "+sum);
			System.out.println("Average = "+average);
		}
		catch (NumberFormatException e) {
            System.out.println("Error: Please enter only integer values. " + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
		}
		catch (ArithmeticException e) {
            System.out.println("Error during arithmetic operation: " + e);
        } catch (Exception e) {
            System.out.println("Some unexpected error occurred: " + e);
        }
	}
		
}
