package tutorial6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class MainExceptions {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 4/2;
        } catch (ArithmeticException e){
            System.out.println("pamietaj nie dziel przez 0");
        }

        System.out.println("result: " + result);


        String filePath = "/Users/konradstrzelecki/Documents/JunitMockito/src/main/resources/text.txt";

        String fileContent = null;
        try {
            fileContent = Files.readString(Path.of(filePath));
        } catch (IOException e) {
            System.out.println("Error while reading file :(");
        }

        System.out.println("fileContent: " + fileContent);
    }
}
