package tutorial8;


import java.util.*;

public class MainList {
    public static void main(String[] args) {

        //numbers[0]

        List<String> names = new ArrayList<>();

        names.add("Konrad");
        names.add("John");
        names.add("Adam");

        names.add(0, "Tomek");

        System.out.println(names.isEmpty());
        System.out.println(names);

        System.out.println(names.size());

        List<String> otherNames = new ArrayList<>();
        otherNames.add("Tomek");
        otherNames.add("Krzys");
        otherNames.add("Bolek");


        names.addAll(otherNames);
        System.out.println(names);

        System.out.println(otherNames);

        List<String> anotherNames = Arrays.asList("Lolek", "Reksio");

        System.out.println("for loop");
        for(String name : names){
            System.out.println(name);
        }

        names.remove("Konrad");

        System.out.println("while loop with iterator:");
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        Collections.reverse(names);
        System.out.println(names);



    }
}
