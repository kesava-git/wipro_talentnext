package OOPS_Inheritance.Question_5;

public class Employee extends Person{
	Double Annual_Salary;
	int Employee_Joining_year;
	String Insurance_number;
	public Double getAnnual_Salary() {
		return Annual_Salary;
	}
	public void setAnnual_Salary(Double annual_Salary) {
		Annual_Salary = annual_Salary;
	}
	public int getEmployee_Joining_year() {
		return Employee_Joining_year;
	}
	public void setEmployee_Joining_year(int employee_Joining_year) {
		Employee_Joining_year = employee_Joining_year;
	}
	public String getInsurance_number() {
		return Insurance_number;
	}
	public void setInsurance_number(String insurance_number) {
		Insurance_number = insurance_number;
	}
	
}