package main;

import generics.ListUtils;

import java.util.List;

public class MainGenericsList {
    public static void main(String[] args) {
        List<String> femaleNames = List.of("Kinga", "Basia", "Kasia", "Asia");
        List<String> maleNames = List.of("Konrad", "Tomek", "Mateusz", "Igor");

        ListUtils listUtils = new ListUtils();

        List<String> allNames = listUtils.union(femaleNames, maleNames);

        System.out.println(allNames);

        List<Integer> oddNumbers = List.of(1, 3, 7, 9);
        List<Integer> evenNumbers = List.of(2, 6, 8, 40);


        List<Integer> allNumber = listUtils.union(oddNumbers, evenNumbers);

        System.out.println(allNumber);
    }
}
