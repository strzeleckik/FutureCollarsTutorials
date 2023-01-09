package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctMain {
    public static void main(String[] args) {
        List<String> medicalSpecs = List.of("Chirurg", "Chirurg", "Dentysta", "Laryngolog", "Pediatra", "Kardiolog", "Pediatra", "Dentysta");

        List<String> distinctSpecs = medicalSpecs
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctSpecs);

        List<String> specsLimited = medicalSpecs
                .stream()
                .distinct()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(specsLimited);


        List<Integer> specNameLength = medicalSpecs
                .stream()
                .distinct()
                .filter(element -> element.endsWith("log"))
                .map(element -> element.length())
                .collect(Collectors.toList());

        System.out.println(specNameLength);

    }
}
