package functionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class Question_1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Akash", "Delhi", 50000));
        employees.add(new Employee(102, "Bhavya", "Pune", 55000));
        employees.add(new Employee(103, "Chirag", "Mumbai", 60000));
        employees.add(new Employee(104, "Divya", "Bangalore", 52000));
        employees.add(new Employee(105, "Esha", "Chennai", 58000));

        Function<Employee, String> getLocation = emp -> emp.location;

        ArrayList<String> locations = new ArrayList<>();
        for (Employee e : employees) {
            locations.add(getLocation.apply(e));
        }

        System.out.println("Locations of Employees:");
        locations.forEach(System.out::println);
    }
}
