package main;

import generics.Pair;

public class MainPair {

    public static void main(String[] args) {
        Pair<String, Integer> myPair = new Pair<>("Telefon", 123);

        System.out.println(myPair.getKey());
        System.out.println(myPair.getValue());
    }

}
