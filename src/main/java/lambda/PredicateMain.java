package lambda;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<String> isStringNotEmpty = (String s) -> !s.isEmpty();

        boolean testResult =  isStringNotEmpty.and((String s) -> s.endsWith("rad")).test("Konrad");
        System.out.println(testResult);
    }


    public static boolean validate(Predicate<String> conditions){
        return conditions.test("xyz");
    }
}
