import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintNumberOfCharacters {


    static public void main(String[] args) throws URISyntaxException, IOException {

        FileUri fileUri = new FileUri();

        String fileContent = Files.readString(Paths.get(fileUri.getFileUri("data.txt")));
        System.out.println(fileContent.length());

    }
}
