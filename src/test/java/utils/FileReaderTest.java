package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void shouldReadFileContent() {
        String testContent = FileReader.readFileContent("/Users/konradstrzelecki/Documents/JunitMockito/src/test/resources/text2.txt");
        Assertions.assertEquals("TestowyContent", testContent);
    }

    @Test
    void shouldReadFileContentOptional() {
        Optional<String> testContent = FileReader.readFileContentOptional("/Users/konradstrzelecki/Documents/JunitMockito/src/test/resources/text.txt");

        Assertions.assertEquals("TestowyContent",  testContent.get());
    }

    @Test
    void shouldNotReadFileContentOptional() {
        Optional<String> testContent = FileReader.readFileContentOptional("/Users/konradstrzelecki/Documents/JunitMockito/src/test/resources/text2.txt");

        Assertions.assertTrue(testContent.isEmpty());
    }
}