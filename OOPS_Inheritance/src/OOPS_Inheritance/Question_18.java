package OOPS_Inheritance;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Question_18 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		StringJoiner s=new StringJoiner(",","{","}");
		list.add("mukkamalla");
		list.add("kesava");
		list.add("narayana");
		list.add("reddy");
		for(String name:list) {
			s.add(name);
		}
		System.out.println(s);
	}
}