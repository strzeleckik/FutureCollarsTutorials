package tutorial6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "/Users/konradstrzelecki/Documents/JunitMockito/src/main/resources/text2.txt";
        File file = new File(filePath);

        boolean fileExists = file.exists();
        System.out.println("fileExists: " + fileExists);

        if(fileExists){
            String fileName = file.getName();
            System.out.println(fileName);

            String fileContent = Files.readString(Path.of(filePath));

            System.out.println("fileContent: " + fileContent);
        }




    }
}
