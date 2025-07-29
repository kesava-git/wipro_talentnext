package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Question_2 {
    public static void main(String[] args) 
    {
        HashSet<String> employeeNames = new HashSet<>();
        employeeNames.add("Anchal Singh");
        employeeNames.add("Keerthi Sureka");
        employeeNames.add("Palki Devi Barman");
        employeeNames.add("Jyotsna Kerthi");
        Iterator<String> iterator = employeeNames.iterator();
        System.out.println("Employee names:");
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
    }
}