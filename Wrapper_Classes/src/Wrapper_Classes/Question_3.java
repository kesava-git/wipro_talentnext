package Wrapper_Classes;

import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1 and 255");
		int n=sc.nextInt();
		if(n<1||n>255)System.out.println("Invalid input. Enter a number between 1 and 255.");
		else{
			String bin=Integer.toBinaryString(n);
			bin=String.format("%8s",bin).replace(' ', '0');
			System.out.println("Binary representation: "+bin);
		}
	}
}
