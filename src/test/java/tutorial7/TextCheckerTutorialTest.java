package tutorial7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

class TextCheckerTutorialTest {

    @ParameterizedTest
    @CsvSource(value = {"TEST :test", " Test:test", "TEST:test"}, delimiter = ':')
    void shouldVerifyStringTrimAndInLowerCase(String input, String expected) {
        String actualValue = input.trim().toLowerCase();
        Assertions.assertEquals(expected, actualValue);
    }


    @ParameterizedTest
    @ValueSource(strings = {"adam", "barbaraa", "Grześu", "Konrad"})
    void shouldVerifyStringHasEvenLength(String input){

        Assertions.assertTrue(TextChecker.hasEvenLength(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"Jaś", "barbara", "Grześ"})
    void shouldReturnFalseWhenInputIsWrong(String input){
        Assertions.assertFalse(TextChecker.hasEvenLength(input));
    }


    @Test
    void shouldReturnProperLength() {
        //given
        String exampleText = "abcde";

        //when
        int actualLength = TextChecker.countAllLetters(exampleText);

        //then
        Assertions.assertEquals(5, actualLength);
    }

    @Test
    void shouldReturnProperLength2() {
        //given
        String exampleText = "abcdeabcdeabcdeabcdeabcde";

        //when
        int actualLength = TextChecker.countAllLetters(exampleText);

        //then
        Assertions.assertEquals(25, actualLength);
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