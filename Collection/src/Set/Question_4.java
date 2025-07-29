package Set;

import java.util.TreeSet;

public class Question_4 {
    TreeSet<String> H1 = new TreeSet<>();
    public TreeSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }
    public String getCountry(String countryName) {
        if (H1.contains(countryName)) {
            return countryName;
        }
        return null;
    }
    public static void main(String[] args) {
        Question_4 obj1 = new Question_4();
        obj1.saveCountryNames("India");
        obj1.saveCountryNames("Australia");

        System.out.println(obj1.getCountry("India"));
        System.out.println(obj1.getCountry("Russia"));
    }
}