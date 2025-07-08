package OOPS_Inheritance;

import java.util.Scanner;

public class Question_15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i+1)=='*') {
				i=i+2;
			}
			else {
				str+=s.charAt(i);
			}
		}
		System.out.println(str);
	}
}
