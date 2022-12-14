package tutorial8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Konrad");
        names.add("Tomek");
        names.add("Kasia");
        names.add("Asia");
        names.add("Konrad");

        for(String name : names){
            System.out.println(name);
        }

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        System.out.println(names);
    }
}
