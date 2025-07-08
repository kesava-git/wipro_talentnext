package OOPS_Inheritance;

import java.util.Scanner;

public class Question_17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length();i++) {
			str+=s.substring(s.length()-3, s.length());
		}
		System.out.println(str);
	}
}
