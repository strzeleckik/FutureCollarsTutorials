package utils;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class FileReader {
    public static String readFileContent(String path) {

        try {
            String fileContent = Files.readString(Path.of(path));
            return fileContent;
        } catch (IOException e){
            return null;
        }

    }

    public static Optional<String> readFileContentOptional(String path) {

        try {
            String fileContent = Files.readString(Path.of(path));
            return Optional.of(fileContent);
        } catch (IOException e){
            return Optional.empty();
        }

    }
}
