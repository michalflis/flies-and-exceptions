import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class PrintFromFile {

    static public void main(String[] args) throws IOException {

        String content = Files.readString(Paths.get("C:/Users/Turczyszyn/IdeaProjects/files-And-exceptions/src/main/resources/data.txt"));
        System.out.println(content);

    }
}
