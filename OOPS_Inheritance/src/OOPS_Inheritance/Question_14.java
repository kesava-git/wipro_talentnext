package OOPS_Inheritance;

import java.util.Scanner;

public class Question_14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.charAt(0)=='x'&& s.charAt(s.length()-1)=='x') {
			System.out.println(s.substring(1,s.length()-1));
		}
	}
}