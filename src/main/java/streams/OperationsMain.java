package streams;

import java.util.List;

public class OperationsMain {
    public static void main(String[] args) {
        List<String> medicalSpecs = List.of("Chirurg", "Chirurg", "Dentysta", "Laryngolog", "Pediatra", "Kardiolog", "Pediatra", "Dentysta");


        long count = medicalSpecs
                .stream()
                .filter(element -> element.equals("Chirurg"))
                .count();

        System.out.println(count);

        boolean anyMatch = medicalSpecs
                .stream()
                .anyMatch(element -> element.endsWith("log"));

        System.out.println(anyMatch);

    }
}
