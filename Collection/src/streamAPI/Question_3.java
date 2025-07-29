package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int rollNo;
    String name;
    int mark;
    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Mark: " + mark);
    }
}

public class Question_3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Akash", 45));
        students.add(new Student(2, "Bhavya", 75));
        students.add(new Student(3, "Chirag", 32));
        students.add(new Student(4, "Divya", 80));
        students.add(new Student(5, "Esha", 55));

        List<Student> clearedStudents = students.stream()
                .filter(s -> s.mark >= 50)
                .collect(Collectors.toList());

        System.out.println("Number of students who cleared the test: " + clearedStudents.size());

        System.out.println("\nDetails of students who cleared:");
        clearedStudents.forEach(Student::display);
    }
}
