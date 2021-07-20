import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FindWord {

    public static void main (String[] args) throws IOException, URISyntaxException {

        System.out.println(searchForTextInFile("data.txt", "Kurs"));

    }

    public static Boolean searchForTextInFile(String fileName, String searchText) throws IOException, URISyntaxException {

        FileUri fileUri = new FileUri();

        String fileContent = Files.readString(Paths.get(fileUri.getFileUri(fileName)));
        return fileContent.contains(searchText);
    }

}