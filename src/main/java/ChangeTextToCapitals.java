import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ChangeTextToCapitals {

    public static void main (String[] args) throws IOException, URISyntaxException {

        File file = new File("src/main/resources/output.txt");
        file.createNewFile();
        Files.writeString(Paths.get("src/main/resources/output.txt"), changeTextToCapitals("data.txt"));

    }

    public static String changeTextToCapitals(String fileName) throws IOException, URISyntaxException {

        FileUri fileUri = new FileUri();
        String fileContent = Files.readString(Paths.get(fileUri.getFileUri(fileName)));
        String textInCapitals = fileContent.toUpperCase();
        return textInCapitals;
    }

}
