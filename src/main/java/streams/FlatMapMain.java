package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMain {
    public static void main(String[] args) {
        List<String> specializations = Arrays.asList("Radiolog:Chirurg:Chirurg Szczękowy", "Internista:Pediatra");

        List<String> specsInArray = specializations
                .stream()
                .map(specialization -> specialization.split(":"))
                .flatMap(array -> Arrays.stream(array))
                .collect(Collectors.toList());

        specsInArray.forEach(element -> System.out.println(element));

    }
}
