package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employ {
    private int id;
    private String name;
    private double salary;

    public Employ(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Question_4 {
    public static void main(String[] args) {
        List<Employ> employees = new ArrayList<>();
        employees.add(new Employ(101, "Alice", 9500));
        employees.add(new Employ(102, "Bob", 12000));
        employees.add(new Employ(103, "Charlie", 8700));
        employees.add(new Employ(104, "David", 15000));
        employees.add(new Employ(105, "Eva", 9200));
        employees.add(new Employ(106, "Frank", 10000));
        employees.add(new Employ(107, "Grace", 7600));

        Predicate<? super Employ> lowSalary = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");
        employees.stream()
                 .filter(lowSalary)
                 .map(Employ::getName)
                 .forEach(System.out::println);
    }
}
