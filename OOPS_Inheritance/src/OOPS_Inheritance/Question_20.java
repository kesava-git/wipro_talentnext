package OOPS_Inheritance;

import java.util.Optional;

public class Question_20 {
	public static void main(String[] args) {
		String names[] = new String[5];
		Optional<String>n=Optional.ofNullable(names[0]);
		if(n.isPresent()) {
			System.out.println(n.get());
		}
		else {
			System.out.println("Null Value");
		}
	}
}
