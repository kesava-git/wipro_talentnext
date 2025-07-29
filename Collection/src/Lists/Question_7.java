package Lists;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employe {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employe(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void getEmployeeDetails() {
        System.out.println("\tDetails\t");
        System.out.println("Employee id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Email : " + email);
        System.out.println("Employee Gender : " + gender);
        System.out.println("Employee Salary : " + salary);
    }

}

public class Question_7 {
    public static void main(String[] args) {
        Vector<Employe> employees = new Vector<>();
        employees.add(new Employe(1, "John Doe", "john@example.com", "Male", 50000));
        employees.add(new Employe(2, "Jane Smith", "jane@example.com", "Female", 60000));

        System.out.println("Listing employees using Enumeration:");
        Enumeration<Employe> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            Employe employee = enumeration.nextElement();
            System.out.println(employee.empId + " " + employee.empName);
        }

        System.out.println("\nListing employees using Iterator:");
        Iterator<Employe> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employe employee = iterator.next();
            System.out.println(employee.empId + " " + employee.empName);
        }
    }
}