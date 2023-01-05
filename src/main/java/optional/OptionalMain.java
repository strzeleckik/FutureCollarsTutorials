package optional;

import utils.FileReader;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<String> testContent = FileReader.readFileContentOptional("/Users/konradstrzelecki/Documents/JunitMockito/src/test/resources/text2.txt");

        System.out.println(testContent.orElse("N"));
    }
}
