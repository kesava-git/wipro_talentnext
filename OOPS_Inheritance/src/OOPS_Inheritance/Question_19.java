package OOPS_Inheritance;

import java.util.StringJoiner;

public class Question_19 {
	public static void main(String[] args) {
		StringJoiner s1=new StringJoiner("-","{","}");
		StringJoiner s2=new StringJoiner("-","{","}");
		s1.add("Chennai");
		s1.add("Mumbai");
		s1.add("Kolkota");
		s2.add("Hyderabad");
		s2.add("Lucknow");
		System.out.println(s1.merge(s2));
		System.out.println(s2.merge(s1));
	}
}