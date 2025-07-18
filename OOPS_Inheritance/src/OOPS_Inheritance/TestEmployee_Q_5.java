package OOPS_Inheritance;

import OOPS_Inheritance.Question_5.Employee;
import OOPS_Inheritance.Question_5.Person;

public class TestEmployee_Q_5 {
	public static void main(String[] args) {
		Person person=new Person();
		Employee emp=new Employee();
		person.setName("M.Kesava Narayana Reddy");
		emp.setAnnual_Salary(100000.00);
		emp.setEmployee_Joining_year(2026);
		emp.setInsurance_number("130804QA1045");
		emp.setName("M.Pawan");
		System.out.println("Person Name: "+person.getName());
		System.out.println("Emplyee Name: "+emp.getName());
		System.out.println("Employee Annual Salary: "+emp.getAnnual_Salary());
		System.out.println("Employee Year of Joining: "+emp.getEmployee_Joining_year());
		System.out.println("Employee Insurance Number: "+emp.getInsurance_number());
	}
}