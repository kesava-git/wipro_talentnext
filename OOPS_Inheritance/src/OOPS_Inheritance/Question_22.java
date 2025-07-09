package OOPS_Inheritance;

import java.util.Optional;

public class Question_22 {
	public static void main(String[] args) {
		Object employee=null;
		Optional<Object>n=Optional.ofNullable(employee);
		System.out.println(n.orElse("InvalidEmployeeException"));
	}
}
