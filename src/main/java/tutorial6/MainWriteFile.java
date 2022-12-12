package tutorial6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainWriteFile {
    public static void main(String[] args) {
        String resourcesPath = "/Users/konradstrzelecki/Documents/JunitMockito/src/main/resources/text2.txt";

        try {
            Files.write(Paths.get(resourcesPath), "Jakis nowy tekst do pliku".getBytes());
        } catch (IOException e){
            System.out.println("problem with saving file");
        }

    }
}
