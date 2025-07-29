package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;
    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public void display() {
        System.out.println("EmpNo: " + empNo + ", Name: " + name + ", Age: " + age + ", Location: " + location);
    }
}

public class Question_2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Rahul", 28, "Pune"));
        employees.add(new Employee(102, "Sneha", 25, "Mumbai"));
        employees.add(new Employee(103, "Amit", 30, "Pune"));
        employees.add(new Employee(104, "Rita", 27, "Delhi"));
        employees.add(new Employee(105, "Vikram", 32, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");
        puneEmployees.forEach(Employee::display);
    }
}
