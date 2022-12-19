package main;

import java.util.Comparator;
import java.util.TreeMap;

public class MainTreeMap {


    public static void main(String[] args) {
        TreeMap<Integer, String> names = new TreeMap<>(Comparator.naturalOrder());
        names.put(6, "Konrad");
        names.put(2, "Adam");
        names.put(4, "Zuza");
        names.put(9, "Ewa");
        names.put(5, "Konrad");

        System.out.println(names);

    }



}
