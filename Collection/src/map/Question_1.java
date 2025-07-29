package map;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Question_1 {
    HashMap<String, String> M1 = new HashMap<>();
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return "No Country with specified capital Name";
    }
    public HashMap<String, String> getCapitalCountryMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }
    public static void main(String[] args) {
        Question_1 obj = new Question_1();
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington D.C.");
        System.out.println("Capital of Japan: " + obj.getCapital("Japan"));
        System.out.println("Country for capital Tokyo: " + obj.getCountry("Tokyo"));
        System.out.println("Country for capital Berlin: " + obj.getCountry("Berlin")); 
        System.out.println("Capital-Country Map: " + obj.getCapitalCountryMap());
        System.out.println("All Countries: " + obj.getAllCountries());
    }
}
