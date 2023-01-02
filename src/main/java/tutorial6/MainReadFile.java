package tutorial6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainReadFile {
    public static void main(String[] args) throws IOException {

        String filePath = "/Users/konradstrzelecki/Documents/JunitMockito/src/main/resources/text.txt";

        String fileContent = Files.readString(Path.of(filePath));
        String newLineText = ",";

        String[] fileContentLines = fileContent.split(newLineText);

        for(String element : fileContentLines){
            System.out.println(element);
        }

        System.out.println(fileContentLines.length);


        System.out.println("fileContent: " + fileContent);


    }
}
