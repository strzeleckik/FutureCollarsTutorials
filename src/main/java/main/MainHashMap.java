package main;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        Map<String, String> codeToCountry = new HashMap<>();

        codeToCountry.put("PL", "Polska");
        codeToCountry.put("GB", "Wielka Brytania");
        codeToCountry.put("PT", "Portugalia");

        System.out.println(codeToCountry.get("PT"));

        System.out.println(codeToCountry.get("PL"));

        codeToCountry.put("AR", "Argentyna");
        if(codeToCountry.containsKey("AR")){
            System.out.println(codeToCountry.get("AR"));
        } else {
            System.out.println("Nie ma kraju o kodzie AR");
        }

        System.out.println(codeToCountry.size());

        codeToCountry.remove("GB");

        System.out.println(codeToCountry.size());

        codeToCountry.put("BR", "Brasil");

        System.out.println(codeToCountry);

        codeToCountry.put("PL", "Poland");

        System.out.println(codeToCountry);

        for(Map.Entry entry : codeToCountry.entrySet()){
            System.out.println("my entry: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
