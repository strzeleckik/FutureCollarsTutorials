package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {
    public static void main(String[] args) {
        IntStream ints1 = IntStream.of(4, 5, 6, 7);

        boolean anyMatch = ints1.anyMatch(value -> value == 10);
        System.out.println(anyMatch);

        List<Integer> grades = List.of(1, 5, 6, 4);

        for (Integer grade : grades){
            System.out.println(grade);
        }

        grades.stream().forEach(System.out::println);

        List<Integer> evenGrades = new ArrayList<>();
        for (Integer grade : grades){
            if(grade % 2 == 0){
                evenGrades.add(grade);
            }
        }
        System.out.println("--------------");
        System.out.println(evenGrades);
        System.out.println(grades);


        List<Integer> evenGradesStream = grades.stream()
                .filter(grade -> grade % 2 == 0 && grade > 4)
                .collect(Collectors.toList());

        System.out.print("evenGradesStream: ");
        System.out.println(evenGradesStream);
    }
}
