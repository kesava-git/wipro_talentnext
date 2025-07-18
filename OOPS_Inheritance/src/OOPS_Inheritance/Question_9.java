package OOPS_Inheritance;

import java.util.Scanner;

public class Question_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(Character.toLowerCase(s1.charAt(s1.length()-1))==Character.toLowerCase(s2.charAt(0))) {
			System.out.println(s1.substring(0, s1.length()-1).concat(s2).toLowerCase());
		}
		else
		System.out.println(s1.concat(" "+s2).toLowerCase());
	}
}