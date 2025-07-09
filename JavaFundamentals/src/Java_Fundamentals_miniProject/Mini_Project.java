package Java_Fundamentals_miniProject;

import java.util.Scanner;

public class Mini_Project {
	public static void main(String[] args) {
		int[] EmpNo= {1001,1002,1003,1004,1004,1005,1006,1007};
		String[] EmpName= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		 String[][] employees = {
		            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
		            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
		            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
		            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
		            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
		            {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
		            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
		        };
		 boolean found=false;
		 for(String[] emp: employees) {
			 int emp_id=Integer.parseInt(emp[0]);
			 if(id==emp_id) {
				 String code=emp[3];
				 String desig="";
				 int da=0;
				 switch(code) {
					 case "e":
						 code="Engineer";
						 da=20000;
						 break;
					 case "c":
						 code="Consultant";
						 da=32000;
						 break;
					 case "k":
						 code="Clerk";
						 da=12000;
						 break;
					 case "r":
						 code="Receptionist";
						 da=15000;
						 break;
					 case "m":
						 code="Manager";
						 da=40000;
						 break;
					 default:
						 code="Unknown";
						 da=0;
				 }
				 int basic=Integer.parseInt(emp[5]);
				 int hra=Integer.parseInt(emp[6]);
				 int it=Integer.parseInt(emp[7]);
				 int sal=basic+hra+da-it;
				 System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
				 System.out.println(emp[0]+"\t"+emp[1]+"\t\t"+emp[4]+"\t\t"+code+"\t"+sal);
				 found=true;
				 break;
			 }
		 }
		 if(found==false) {
			 System.out.println("There is no employee with empid : "+id);
		 }
	}
}
