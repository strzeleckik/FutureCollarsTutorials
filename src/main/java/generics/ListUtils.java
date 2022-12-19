package generics;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public <E> List<E> union(List<E> listA, List<E> listB){
        List<E> unionedList = new ArrayList<>(listA);
        unionedList.addAll(listB);

        return unionedList;
    }
}
