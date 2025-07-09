package OOPS_Inheritance;

import java.util.Optional;

public class Question_21 {
	public static void main(String[] args) {
		String address = null;
		Optional<String>n=Optional.ofNullable(address);
		System.out.println(n.orElse("India"));
	}
}
