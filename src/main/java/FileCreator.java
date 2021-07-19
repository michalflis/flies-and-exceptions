import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCreator {

    public static void main (String[] args) throws IOException, URISyntaxException {


        String path = "src/main/resources/data.txt";
        String text = "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku";


        File file = new File(path);
        file.createNewFile();

        Files.writeString(Paths.get(path), text);
    }

}
