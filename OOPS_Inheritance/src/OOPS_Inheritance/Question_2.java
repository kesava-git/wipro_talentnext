package OOPS_Inheritance;

import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int powerInt=calc.powerInt(calc.num1, calc.num2);
		Double powerDouble=calc.powerDouble(calc.num1, calc.num2);
		System.out.println(powerInt);
		System.out.println(powerDouble);
	}
}
class Calculator{
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
	}
}
