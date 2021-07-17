import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintEverySecondLine {

    public static void main(String[] args) throws IOException, URISyntaxException {

        FileUri fileUri = new FileUri();

        String fileContent = Files.readString(Paths.get(fileUri.getFileUri("data.txt")));
        String[] fileLines = fileContent.split("\n");
        for (int i = 0; i <= fileLines.length - 1;  i = i + 2)
            System.out.println(fileLines[i]);

    }

}

