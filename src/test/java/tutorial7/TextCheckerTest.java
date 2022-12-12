package tutorial7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

class TextCheckerTest {

    @ParameterizedTest
    @ValueSource(strings = {"adam", "barbara", "Grześ"})
    void shouldVerifyStringHasEvenLength(String input){
        Assertions.assertTrue(TextChecker.hasEvenLength(input));
    }


    @ParameterizedTest
    @MethodSource("provideTestArgsForCountLetters")
    void shouldReturnProperStringLength(String input, int expectedLetterCount) {
        int actualValue = TextChecker.countAllLetters(input);
        Assertions.assertEquals(expectedLetterCount, actualValue);
    }

    private static Stream<Arguments> provideTestArgsForCountLetters() {
        return Stream.of(
                Arguments.of("TEST ", 5),
                Arguments.of("Testtt", 6),
                Arguments.of(null, 0)
        );
    }
}